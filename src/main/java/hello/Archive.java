package hello;

/**
 * Created by Thomas on 1/26/2017.
 */

public class Archive {
    private final long ID;
    private final String PODCAST_NAME;
    private final String PODCAST_THUMBNAIL;

    public Archive(long id, String podcastName, String podcastThumbnail) {
        ID = id;
        PODCAST_NAME = podcastName;
        PODCAST_THUMBNAIL = podcastThumbnail;
    }

    public long getID(){
        return ID;
    }

    public String getPodcastName(){
        return  PODCAST_NAME;
    }

    public String getPodcstThumbnail(){
        return PODCAST_THUMBNAIL;
    }
}
