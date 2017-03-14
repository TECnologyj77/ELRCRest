package hello;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getArtistDesc() {
		return artistDesc;
	}

	public void setArtistDesc(String artistDesc) {
		this.artistDesc = artistDesc;
	}

	public String getDjName() {
		return djName;
	}

	public void setDjName(String djName) {
		this.djName = djName;
	}

	public String getDjDesc() {
		return djDesc;
	}

	public void setDjDesc(String djDesc) {
		this.djDesc = djDesc;
	}

	public String getDjImage() {
		return djImage;
	}

	public void setDjImage(String djImage) {
		this.djImage = djImage;
	}
}
