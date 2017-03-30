package hello;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
public interface ArchiveDao extends CrudRepository<Archive, Long> {

    public ArrayList<Archive> findByPodcastName(String podcastName);

}