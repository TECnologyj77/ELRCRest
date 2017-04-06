package hello;

import javafx.scene.shape.Arc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;

@RestController
public class ArchiveController {

    private ArrayList<Archive> savedArchive;



    private String podcastNam;
    private String podcastThumb;
    private Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/elrc_radio?useSSL=false", "root", "admin");
    private Statement st = conn.createStatement();
    private String drop = "DROP TABLE ARCHIVE";
    @Autowired
    private ArchiveDao archiveDao;

    public ArchiveController() throws SQLException {
    }


    public ArrayList<Archive> saveArchiveList() throws SQLException {

        ArrayList<Archive> buildDBArchive = new ArrayList<Archive>();

        buildDBArchive.add(new Archive("Greg's Podcast Title", "Greg's Thumbnail"));
        buildDBArchive.add(new Archive("Ryan's Podcast Title", "Ryan's Thumbnail"));
        buildDBArchive.add(new Archive("Tom's Podcast Title", "Tom's Thumbnail"));
        buildDBArchive.add(new Archive("Nate's Podcast Title", "Nate's Thumbnail"));
        buildDBArchive.add(new Archive("Khalid's Podcast Title", "Khalid's Thumbnail"));
        buildDBArchive.add(new Archive("Kennys's Podcast Title", "Kenny's Thumbnail"));

        savedArchive = buildDBArchive;
       // st.executeUpdate(drop);
        archiveDao.save(savedArchive);

        return savedArchive;
    }



    @RequestMapping("archive/all_podcasts")
    public ArrayList<Archive> archive(@RequestParam(value = "podcastName", defaultValue = "none") String podcastName,
                           @RequestParam(value = "podcastThumbnail", defaultValue = "none")String podcastThumbnail) throws SQLException {


        //SQL query
        String query = "SELECT * FROM archive";
        String drop = "DROP TABLE ARCHIVE";
        Statement st = conn.createStatement();

        saveArchiveList();

        ResultSet rs = st.executeQuery(query);
        while(rs.next()){

            podcastNam = rs.getString("podcast_Name");
            podcastThumb = rs.getString("podcast_Thumbnail");
        }

        return null;
    }
}