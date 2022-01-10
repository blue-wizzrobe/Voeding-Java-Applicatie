package nl.voeding.backend.Voeding.Controller;

import nl.voeding.backend.Voeding.Domein.Receptingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ReceptingredientRepository extends CrudRepository <Receptingredient, Long> {

}