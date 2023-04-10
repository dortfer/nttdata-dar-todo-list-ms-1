package com.nttdata.nttdatadartodolistms1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface that extends CrudRepository, used to manage web requests.
 * @author nttdata
 *
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}
