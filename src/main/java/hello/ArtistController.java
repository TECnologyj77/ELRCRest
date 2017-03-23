package hello;

import java.sql.Array;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
		buildDBArtists.add(new Artist("Billy", "Bob", "Thorton", "Egg", "Pic"));
		buildDBArtists.add(new Artist("Joe", "Bob", "Thorton", "Egg", "Pic"));
		buildDBArtists.add(new Artist("Moe", "Bob", "Thorton", "Egg", "Pic"));
		buildDBArtists.add(new Artist("Tom", "Bob", "Thorton", "Egg", "Pic"));
		buildDBArtists.add(new Artist("Nate", "Bob", "Thorton", "Egg", "Pic"));
/*
	   ArrayList<Artist> findArtist = artistDao.findByArtistName(artist_name);
	   System.out.println(findArtist);
	   Artist getTeacherArtist = artistDao.findOne((long)13);
	   System.out.println(getTeacherArtist);
	   getTeacherArtist.setDjName("DJ Jazzy Jeff");
       //Artist artist = new Artist(String.format(artist_name), String.format(artist_desc), String.format(DJ_name), String.format(DJ_desc), String.format(DJ_image));
       return artistDao.save(getTeacherArtist);
   }*/

		for (int i = 0; i < buildDBArtists.size(); i++) {
			artistDao.save(buildDBArtists.get(i));
		}

		Artist  getArtist = artistDao.findOne((long)3);
		return artistDao.save(getArtist);
	}
}
