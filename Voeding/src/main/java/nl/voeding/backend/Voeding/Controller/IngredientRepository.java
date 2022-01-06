package nl.voeding.backend.Voeding.Controller;

import nl.voeding.backend.Voeding.Domein.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface IngredientRepository extends CrudRepository <Ingredient, Long> {
	

}
