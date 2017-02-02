package hello;

import java.util.ArrayList;

/**
 * Created by Thomas on 1/26/2017.
 */

public class Artist {
    private final long ARTIST_ID;
    private final String ARTIST_NAME;
    private final String ARTIST_DESC;
    private final String DJ_NAME;
    private final String DJ_DESC;
    private final String DJ_IMAGE;

    public Artist(long id, String artist_name, String artist_desc, String dj_name, String dj_desc, String dj_image){
        ARTIST_ID = id;
        ARTIST_NAME = artist_name;
        ARTIST_DESC = artist_desc;
        DJ_NAME = dj_name;
        DJ_DESC = dj_desc;
        DJ_IMAGE = dj_image;
    }

    public long getArtist_id(){
        return ARTIST_ID;
    }

    public String getArtist_Name(){
        return ARTIST_NAME;
    }

    public String getArtist_Desc(){
        return ARTIST_DESC;
    }
    public String getDJ_Name(){
        return DJ_NAME;
    }
    public String getDJ_Desc(){
        return DJ_DESC;
    }
    public String getDJ_Image(){
        return DJ_IMAGE;
    }


}
