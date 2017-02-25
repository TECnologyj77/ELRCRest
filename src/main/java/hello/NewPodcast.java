package hello;

/**
 * Created by Thomas on 2/4/2017.
 */

public class NewPodcast {

    private String titleOfPodcast;

    private String podcastURL;

    private String podcastDescription;

    private int showID;

    public NewPodcast(){}

    public void setTitleOfPodcast(String titleOfPodcast) {
        this.titleOfPodcast = titleOfPodcast;
    }

    public void setPodcastURL(String podcastURL) {
        this.podcastURL = podcastURL;
    }

    public void setPodcastDescription(String podcastDescription) {
        this.podcastDescription = podcastDescription;
    }

    public void setShowID(int showID) { this.showID = showID; }

    public String getTitleOfPodcast(){
        return titleOfPodcast;
    }

    public String getPodcastURL() {
        return podcastURL;
    }

    public String getPodcastDescription() {
        return podcastURL;
    }

    public int getShowID() {
        return showID;
    }

}
