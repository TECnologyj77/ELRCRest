package hello;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
public interface ArtistDao extends CrudRepository<Artist, Long> {

	public ArrayList<Archive> findByArtistName(String artistName);

}
