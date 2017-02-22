package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArtistController {

   @RequestMapping("/artists/all_artists")
    public Artist artist(@RequestParam(value = "artist_name",defaultValue = "none")String artist_name,
                         @RequestParam(value = "artist_desc", defaultValue = "none")String artist_desc,
                         @RequestParam(value = "DJ_name" , defaultValue = "none")String DJ_name,
                         @RequestParam(value = "DJ_desc", defaultValue = "none")String DJ_desc,
                         @RequestParam(value = "DJ_image", defaultValue = "none")String DJ_image){

       return new Artist(1l, String.format(artist_name), String.format(artist_desc), String.format(DJ_name), String.format(DJ_desc), String.format(DJ_image));
   }
}
