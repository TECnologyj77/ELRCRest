package hello;


import javax.persistence.*;

@Entity
@Table(name = "shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long showID;
    private String showName;
    private String showDesc;
    private String showImage;
    private String djName;
    private String embeddedURL;
    private String podcastTitle;
    private String podcastDesc;

    public Show(String show_name, String show_desc, String show_image, String dj_name,
                String embedded_url, String podcast_title, String podcast_desc) {
        setShowName(show_name);
        setShowDesc(show_desc);
        setShowImage(show_image);
        setDjName(dj_name);
        setEmbeddedURL(embedded_url);
        setPodcastTitle(podcast_title);
        setPodcastDesc(podcast_desc);
    }

    public Show() {

    }

    public long getShowID(){
        return showID;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowDesc() {
        return showDesc;
    }

    public void setShowDesc(String showDesc) {
        this.showDesc = showDesc;
    }

    public String getShowImage() {
        return showImage;
    }

    public void setShowImage(String showImage) {
        this.showImage = showImage;
    }

    public String getDjName() {
        return djName;
    }

    public void setDjName(String djName) {
        this.djName = djName;
    }

    public String getEmbeddedURL() {
        return embeddedURL;
    }

    public void setEmbeddedURL(String embeddedURL) {
        this.embeddedURL = embeddedURL;
    }

    public String getPodcastTitle() {
        return podcastTitle;
    }

    public void setPodcastTitle(String podcastTitle) {
        this.podcastTitle = podcastTitle;
    }

    public String getPodcastDesc() {
        return podcastDesc;
    }

    public void setPodcastDesc(String podcastDesc) {
        this.podcastDesc = podcastDesc;
    }
}
