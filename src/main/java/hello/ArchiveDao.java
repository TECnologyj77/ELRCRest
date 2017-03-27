package hello;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ArchiveDao extends CrudRepository<Archive, Long> {

    // NEEDS TO BE COMPLETED

}