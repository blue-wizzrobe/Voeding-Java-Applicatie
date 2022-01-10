package nl.voeding.backend.Voeding.Controller;

import nl.voeding.backend.Voeding.Domein.Recept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ReceptRepository extends CrudRepository <Recept, Long> {

}