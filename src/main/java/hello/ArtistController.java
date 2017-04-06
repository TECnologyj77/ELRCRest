package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;

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
				"Greg's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Ryan 'the Corporal' Couch", "Artist Description", "DJ Ryan",
				"Ryan's Description", "Bio Pic"));
		buildDBArtists.add(
				new Artist("Tom 'the Cruise' Carney", "Artist Description", "DJ Tom", "Tom's Description", "Bio Pic"));
		buildDBArtists.add(
				new Artist("Nate 'TwinTurbo' Irwin", "Artist Description", "DJ Nate", "Nate's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Khalid 'the DJ' Fallatah", "Artist Description", "DJ Khalid",
				"Khalid's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Kenny 'the Fresh' Swegman", "Artist Description", "DJ Kenny Fresh",
				"Kenny's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Paul Blart", "Artist Description", "DJ Blart", "Paul's Description", "Bio Pic"));

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

/*
 * Artist getArtist = artistDao.findOne((long)3); ArrayList<Artist> findArtist =
 * artistDao.findByArtistName(artist_name); System.out.println(findArtist);
 * Artist getTeacherArtist = artistDao.findOne((long)13);
 * System.out.println(getTeacherArtist);
 * getTeacherArtist.setDjName("DJ Jazzy Jeff"); //Artist artist = new
 * Artist(String.format(artist_name), String.format(artist_desc),
 * String.format(DJ_name), String.format(DJ_desc), String.format(DJ_image));
 * return artistDao.save(getTeacherArtist); }
 */
