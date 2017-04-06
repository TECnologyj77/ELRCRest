package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;

@RestController
public class ShowController {

    private ArrayList<Show> savedShows;
    private String showName;
    private String showDescr;
    private String showImg;
    private String djName;
    private String embeddedUrl;
    private String podcastTitle;
    private String podcastDesc;


    @Autowired
    private ShowDao showDao;

    public ArrayList<Show> saveShowList(){

        ArrayList<Show> buildDBShows = new ArrayList<Show>();

        buildDBShows.add(new Show("The Greg Show", "Greg Show Description", "Show Image", "DJ Greg", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The Corporal Show", "Corporal Show Description", "Show Image", "DJ Ryan", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The Tom Cruise Show", "Tom Cruise Show Description", "Show Image", "DJ Tom", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The TwinTurbo Show", "TwinTurbo Show Description", "Show Image", "DJ Nate", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The DJ Khalid Show", "DJ Khalid Show Description", "Show Image", "DJ Khalid", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The KSweg Show", "KSweg Show Description", "Show Image", "DJ Kenny Fresh", "Embedded URL", "Podcast Title", "Podcast Desc"));

      savedShows = buildDBShows;
        showDao.save(savedShows);

        return savedShows;
    }





    @RequestMapping("/shows/artistShow")
    public ArrayList<Show> show(@RequestParam(value = "show_name", defaultValue = "none") String name,
                     @RequestParam(value = "show_desc", defaultValue = "none") String showDesc,
                     @RequestParam(value = "show_image", defaultValue = "none") String show_image,
                     @RequestParam(value = "dj_name", defaultValue = "none") String dj_name,
                     @RequestParam(value = "embedded_url", defaultValue = "none") String url,
                     @RequestParam(value = "podcast_title", defaultValue = "none") String podcast_title,
                     @RequestParam(value = "podcast_desc", defaultValue = "none") String podcast_desc) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/elrc_radio?useSSL=false", "root", "admin");
        //SQL query
        String query = "SELECT * FROM show";
        Statement st = conn.createStatement();

        saveShowList();

        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            showName = rs.getString("show_name");
            showDescr = rs.getString("show_desc");
            showImg = rs.getString("show_image");
            djName = rs.getString("dj_name");
            embeddedUrl = rs.getString("embedded_url");
            podcastTitle = rs.getString("podcast_title");
            podcastDesc = rs.getString("podcast_desc");
        }

        return null;

    }


}
