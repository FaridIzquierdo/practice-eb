package edu.upc.practiceeb.repository;

import edu.upc.practiceeb.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
