package hello;

import javax.persistence.*;

@Entity
@Table(name = "archive")
public class Archive {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long podcastID;
    private String podcastName;
    private String podcastThumbnail;

    public Archive(String podcast_Name, String podcast_Thumbnail) {
        setPodcastName(podcast_Name);
        setPodcastThumbnail(podcast_Thumbnail);
    }

    public Archive() {

    }

    public String getPodcastName() {
        return podcastName;
    }

    public void setPodcastName(String podcastName) {
        this.podcastName = podcastName;
    }

    public String getPodcastThumbnail() {
        return podcastThumbnail;
    }

    public void setPodcastThumbnail(String podcastThumbnail) {
        this.podcastThumbnail = podcastThumbnail;
    }
}
