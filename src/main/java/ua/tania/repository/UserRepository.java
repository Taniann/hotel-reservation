package ua.tania.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.tania.entity.User;

/**
 * Created by Tania Nebesna on 13.02.2019.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
