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

        buildDBArchive.add(new Archive("Greg's Cowboy Hat Podcast", "https://www.youtube.com/embed/glb2U6y-GdU"));
        buildDBArchive.add(new Archive("Ryan's HIMAR Podcast", "https://www.youtube.com/embed/oWqCVDhf6Lk"));
        buildDBArchive.add(new Archive("Tom Cruise's Podcast", "https://www.youtube.com/embed/PLzVbz2HHzo"));
        buildDBArchive.add(new Archive("Nate's No Chill Podcast", "https://www.youtube.com/embed/AkC6Hb2ZmQs"));
        buildDBArchive.add(new Archive("Khalid's We Da Best Podcast", "https://www.youtube.com/embed/vHyB_FRr4-M"));
        buildDBArchive.add(new Archive("Kenny's Fresh Air Podcast", "https://www.youtube.com/embed/x2g5Vw2qpdc"));

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