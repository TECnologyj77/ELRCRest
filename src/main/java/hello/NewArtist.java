package hello;


public class NewArtist {

    private String firstName;

    private String lastName;

    private String djName;

    private String artistDesc;

    public String artistImage;

    public NewArtist() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDJName(String djName) {
        this.djName = djName;
    }

    public void setArtistDesc(String artistDesc) {
        this.artistDesc = artistDesc;
    }

    public void setArtistImage(String artistImage) {
        this.artistImage = artistImage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDJName() {
        return djName;
    }

    public String getArtistDesc() {
        return artistDesc;
    }

    public String getArtistImage() {
        return artistImage;
    }
}
