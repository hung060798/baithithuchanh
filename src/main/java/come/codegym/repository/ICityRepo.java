package come.codegym.repository;

import come.codegym.model.Cities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepo extends CrudRepository<Cities, Long> {
}
