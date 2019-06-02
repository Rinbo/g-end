package nu.borjessons.app.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nu.borjessons.app.ws.io.entity.GraphEntity;

@Repository
public interface GraphRepository extends CrudRepository<GraphEntity, Long> {

	String findByPublicString(String publicString);

}
