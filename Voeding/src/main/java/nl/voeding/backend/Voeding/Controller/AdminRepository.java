package nl.voeding.backend.Voeding.Controller;

import nl.voeding.backend.Voeding.Domein.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AdminRepository extends CrudRepository <Admin, Long> {
}
