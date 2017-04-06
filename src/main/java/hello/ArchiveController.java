package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping("archive/all_podcasts")
public class ArchiveController {

    @Autowired
    private ArchiveDao archiveDao;

    public void saveArchiveList() {

        ArrayList<Archive> buildDBArchive = new ArrayList<Archive>();

        buildDBArchive.clear();

        buildDBArchive.add(new Archive("Greg's Podcast Title", "Greg's Thumbnail"));
        buildDBArchive.add(new Archive("Ryan's Podcast Title", "Ryan's Thumbnail"));
        buildDBArchive.add(new Archive("Tom's Podcast Title", "Tom's Thumbnail"));
        buildDBArchive.add(new Archive("Nate's Podcast Title", "Nate's Thumbnail"));
        buildDBArchive.add(new Archive("Khalid's Podcast Title", "Khalid's Thumbnail"));
        buildDBArchive.add(new Archive("Kennys's Podcast Title", "Kenny's Thumbnail"));

        archiveDao.save(buildDBArchive);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Archive> getArchive() throws SQLException {

        if (archiveDao.findOne((long) 1) == null) {
            saveArchiveList();
        }

        Iterable<Archive> archiveFromDB = archiveDao.findAll();

        ArrayList<Archive> archives = new ArrayList<Archive>();

        for (Archive item : archiveFromDB){
            archives.add(item);
        }
        return archives;
    }

    @RequestMapping(method = RequestMethod.POST)
    public long addArchive(@RequestBody Archive input) throws SQLException {

        Archive added = archiveDao.save(input);

        return added.getPodcastID();
    }
}