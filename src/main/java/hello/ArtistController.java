package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping("/artists/all_artists")
public class ArtistController {

	@Autowired
	private ArtistDao artistDao;

	public void saveArtistList() {

		ArrayList<Artist> buildDBArtists = new ArrayList<Artist>();

		buildDBArtists.clear();

		buildDBArtists.add(new Artist("Greg 'the Professor' Lang", "Artist Description", "DJ Greg",
				"Hi, my name is Greg. I love cowboy hats and aviators!", "http://earthboundexpeditions.com/wp-content/uploads/2017/03/tn_Paul-in-Cuba_host-thumb.jpg"));
		buildDBArtists.add(new Artist("Ryan 'the Corporal' Couch", "Artist Description", "DJ Ryan",
				"Yo, my name is Ryan. I love to be sarcastic, blow stuff up and code things!", "https://www.military-ranks.org/images/ranks/marinecorps/large/xcorporal.png.pagespeed.ic.66TbXXZPVy.png"));
		buildDBArtists.add(
				new Artist("Tom 'the Cruise' Carney", "Artist Description", "DJ Tom", "My name is Cruise, Tom Cruise!", "http://www.freenewimages.com/wp-content/uploads/2017/03/hd-2017-images-tom-cruise-250x250.jpg"));
		buildDBArtists.add(
				new Artist("Nate 'TwinTurbo' Irwin", "Artist Description", "DJ Nate", "My name is Nate, I have no chill...", "https://i2.wp.com/opensourceforu.com/wp-content/uploads/2011/03/coding-error.jpg?resize=200%2C200"));
		buildDBArtists.add(new Artist("Khalid 'the DJ' Fallatah", "Artist Description", "DJ Khalid",
				"DJ Khaled, WE DA BEST!!!!", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNbyVvfde1Y8sfP8luHtWJNU6HS-wO_hdleMPomAK584Zz82Kaig"));
		buildDBArtists.add(new Artist("Kenny 'the Fresh' Swegman", "Artist Description", "DJ Kenny Fresh",
				"Hi my name is Kenneth Swegman. You can call me Kenny, I like doing stuff for the radio club!", "http://www.rustyzipper.com/images/costumes/250_freshprince.jpg"));
		buildDBArtists.add(new Artist("Paul Blart", "Artist Description", "DJ Blart", "My name is Paul Blart, I'm a mall cop and such...", "http://vignette1.wikia.nocookie.net/paulblartmallcop/images/5/52/Paul-wiki.jpg/revision/latest?cb=20120709055758"));

		artistDao.save(buildDBArtists);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<Artist> getArtist() throws SQLException {

		if (artistDao.findOne((long) 1) == null) {
			saveArtistList();
		}

		Iterable<Artist> artistsFromDB = artistDao.findAll();

		ArrayList<Artist> artists = new ArrayList<Artist>();

		for (Artist item : artistsFromDB) {
			artists.add(item);
		}

		return artists;
	}

	@RequestMapping(method = RequestMethod.POST)
	public long addArtist(@RequestBody Artist input) throws SQLException {

		Artist added = artistDao.save(input);

		return added.getArtistId();
	}
}