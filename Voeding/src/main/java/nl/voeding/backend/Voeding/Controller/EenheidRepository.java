package nl.voeding.backend.Voeding.Controller;

import nl.voeding.backend.Voeding.Domein.Eenheid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EenheidRepository extends CrudRepository <Eenheid, Long> {
}
