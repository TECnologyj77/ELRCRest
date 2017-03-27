package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArchiveController {

    @Autowired
    private ArchiveDao archiveDao;

    @RequestMapping("archive/all_podcasts")
    public Archive archive(@RequestParam(value = "podcastName", defaultValue = "none") String podcastName,
                           @RequestParam(value = "podcastThumbnail", defaultValue = "none")String podcastThumbnail){


        ArrayList<Archive> buildDBArchive = new ArrayList<Archive>();

        buildDBArchive.add(new Archive("Greg's Podcast Title", "Greg's Thumbnail"));
        buildDBArchive.add(new Archive("Ryan's Podcast Title", "Ryan's Thumbnail"));
        buildDBArchive.add(new Archive("Tom's Podcast Title", "Tom's Thumbnail"));
        buildDBArchive.add(new Archive("Nate's Podcast Title", "Nate's Thumbnail"));
        buildDBArchive.add(new Archive("Khalid's Podcast Title", "Khalid's Thumbnail"));
        buildDBArchive.add(new Archive("Kennys's Podcast Title", "Kenny's Thumbnail"));

        for (int i = 0; i < buildDBArchive.size(); i++) {
            archiveDao.save(buildDBArchive.get(i));
        }

        Archive getArchiveVideo = archiveDao.findOne((long)3);
        return archiveDao.save(getArchiveVideo);
    }
}