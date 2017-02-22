package hello;

public class User {

    private String firstName;

    private String lastName;

    private String dJName;

    private String artistDesc;

    public String artistImage;

    public User(){}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDJName(String dJName){
        this.dJName= dJName;
    }

    public void setArtistDesc(String artistDesc){
        this.artistDesc = artistDesc;
    }

    public void setArtistImage(String artistImage){
        this.artistImage = artistImage;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDJName() {
        return dJName;
    }

    public String getArtistDesc(){
        return artistDesc;
    }

    public String getArtistImage(){
        return artistImage;
    }
}
