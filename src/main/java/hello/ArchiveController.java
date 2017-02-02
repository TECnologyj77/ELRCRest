package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Thomas on 1/26/2017.
 */

@RestController
public class ArchiveController {
    @RequestMapping("archive/all_podcasts")
    public Archive archive(@RequestParam(value = "podcastName", defaultValue = "none") String podcastName, @RequestParam(value = "podcastThumbnail", defaultValue = "none")String podcastThumbnail){
        return new Archive(1,String.format(podcastName), String.format(podcastThumbnail));
    }
}
