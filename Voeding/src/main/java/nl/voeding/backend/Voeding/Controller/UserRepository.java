package nl.voeding.backend.Voeding.Controller;

import nl.voeding.backend.Voeding.Domein.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository <User, Long> {

}