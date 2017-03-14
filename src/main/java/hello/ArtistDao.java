package hello;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ArtistDao extends CrudRepository<Artist, Long> {

	public Artist findByArtistName(String artistName);

}
