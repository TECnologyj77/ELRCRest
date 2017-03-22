package hello;

import java.util.ArrayList;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ArtistDao extends CrudRepository<Artist, Long> {

	public ArrayList<Artist> findByArtistName(String artistName);

}
