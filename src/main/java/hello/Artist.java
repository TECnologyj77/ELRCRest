package hello;

import javax.persistence.*;

/**
 * Created by Thomas on 1/26/2017.
 */
@Entity
@Table(name = "artists")
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long artistId;
	private String artistName;
	private String artistDesc;
	private String djName;
	private String djDesc;
	private String djImage;

	public Artist(String artist_name, String artist_desc, String dj_name, String dj_desc, String dj_image) {
		setArtistName(artist_name);
		setArtistDesc(artist_desc);
		setDjName(dj_name);
		setDjDesc(dj_desc);
		setDjImage(dj_image);
	}

	public Artist() {

	}


	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public void setArtistDesc(String artistDesc) {
		this.artistDesc = artistDesc;
	}

	public void setDjName(String djName) {
		this.djName = djName;
	}

	public void setDjDesc(String djDesc) {
		this.djDesc = djDesc;
	}

	public void setDjImage(String djImage) {
		this.djImage = djImage;
	}

	public String toString() {

		return artistId + " : " + artistName + " : " + artistDesc;

	}
}
