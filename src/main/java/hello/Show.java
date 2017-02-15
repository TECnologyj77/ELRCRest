package hello;


public class Show {
    private final long SHOW_ID;
    private final String SHOW_NAME;
    private final String SHOW_DESC;
    private final String SHOW_IMAGE;
    private final String DJ_NAME;
    private final String EMBEDDED_URL;
    private final String PODCAST_TITLE;
    private final String PODCAST_DESC;

    public Show(long show_id, String show_name, String show_desc, String show_image, String dj_name,
                String embedded_url, String podcast_title, String podcast_decs ) {
        this.SHOW_ID = show_id;
        this.SHOW_NAME = show_name;
        this.SHOW_DESC = show_desc;
        this.SHOW_IMAGE = show_image;
        this.DJ_NAME = dj_name;
        this.EMBEDDED_URL = embedded_url;
        this.PODCAST_TITLE = podcast_title;
        this.PODCAST_DESC = podcast_decs;

    }

    public long getShowId() {
        return SHOW_ID;
    }

    public String getShow_Name() {
        return SHOW_NAME;
    }

    public String getShow_Desc() {
        return SHOW_DESC;
    }

    public String getShow_Image() {
        return SHOW_IMAGE;
    }

    public String getDj_Name() {
        return DJ_NAME;
    }

    public String getEmbedded_URL() {
        return EMBEDDED_URL;
    }

    public String getPodcast_Title() {
        return PODCAST_TITLE;
    }

    public String getPodcast_Decs(){return PODCAST_DESC;}
}
