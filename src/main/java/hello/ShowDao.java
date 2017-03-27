package hello;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
public interface ShowDao extends CrudRepository<Show, Long> {

    public ArrayList<Artist> findByShowName(String showName);

}