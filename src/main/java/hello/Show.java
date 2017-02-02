package hello;

import java.awt.Image;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by Thomas on 1/24/2017.
 */

public class Show {
    private final long ID;
    private final String SHOW_NAME;
    private final String SHOW_DESC;
    private final String EMBEDDED_URL;
    private final String DJ_NAME;
    private final String DJ_DESC;
    private final String DJ_IMAGE;

    public Show(long id, String show_name, String desc, String embedded_url, String dj_name, String dj_desc, String dj_image) {
        this.SHOW_NAME = show_name;
        this.SHOW_DESC = desc;
        this.ID = id;
        this.EMBEDDED_URL = embedded_url;
        this.DJ_NAME = dj_name;
        this.DJ_DESC = dj_desc;
        this.DJ_IMAGE = dj_image;
    }

    public String getName() {
        return SHOW_NAME;
    }

    public String getSHOW_DESC() {
        return SHOW_DESC;
    }

    public String getEmbedded_URL() {
        return EMBEDDED_URL;
    }

    public String getDj_Name() {
        return DJ_NAME;
    }

    public long getId() {
        return ID;
    }

    public String getDJ_Desc() {
        return DJ_DESC;
    }

     public String getDJ_Image(){return DJ_IMAGE;}
}
