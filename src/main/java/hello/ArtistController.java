package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class ArtistController {

	@Autowired
	private ArtistDao artistDao;

	@RequestMapping("/artists/all_artists")
	public Artist artist(@RequestParam(value = "artist_name", defaultValue = "none") String artist_name,
						 @RequestParam(value = "artist_desc", defaultValue = "none") String artist_desc,
						 @RequestParam(value = "DJ_name", defaultValue = "none") String DJ_name,
						 @RequestParam(value = "DJ_desc", defaultValue = "none") String DJ_desc,
						 @RequestParam(value = "DJ_image", defaultValue = "none") String DJ_image) {


		ArrayList<Artist> buildDBArtists = new ArrayList<Artist>();
		buildDBArtists.add(new Artist("Greg 'the Professor' Lang", "Artist Description", "DJ Greg", "Greg's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Ryan 'the Corporal' Couch", "Artist Description", "DJ Ryan", "Ryan's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Tom 'the Cruise' Carney", "Artist Description", "DJ Tom", "Tom's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Nate 'TwinTurbo' Irwin", "Artist Description", "DJ Nate", "Nate's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Khalid 'the DJ' Fallatah", "Artist Description", "DJ Khalid", "Khalid's Description", "Bio Pic"));
		buildDBArtists.add(new Artist("Kenny 'the Fresh' Swegman", "Artist Description", "DJ Kenny Fresh", "Kenny's Description", "Bio Pic"));

		for (int i = 0; i < buildDBArtists.size(); i++) {
			artistDao.save(buildDBArtists.get(i));
		}

		Artist  getArtist = artistDao.findOne((long)3);
		return artistDao.save(getArtist);
	}
}

/*
	   ArrayList<Artist> findArtist = artistDao.findByArtistName(artist_name);
	   System.out.println(findArtist);
	   Artist getTeacherArtist = artistDao.findOne((long)13);
	   System.out.println(getTeacherArtist);
	   getTeacherArtist.setDjName("DJ Jazzy Jeff");
       //Artist artist = new Artist(String.format(artist_name), String.format(artist_desc), String.format(DJ_name), String.format(DJ_desc), String.format(DJ_image));
       return artistDao.save(getTeacherArtist);
   }*/
