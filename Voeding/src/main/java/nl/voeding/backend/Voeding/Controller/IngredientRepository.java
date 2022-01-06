package nl.voeding.backend.Voeding.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.voeding.backend.Voeding.Domein.Ingredient;

@Component
public interface IngredientRepository extends CrudRepository <Ingredient, Long> {
	

}
