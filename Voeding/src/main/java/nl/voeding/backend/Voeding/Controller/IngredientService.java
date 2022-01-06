package nl.voeding.backend.Voeding.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.voeding.backend.Voeding.Domein.Ingredient;

@Service
public class IngredientService {
    @Autowired
    IngredientRepository pr;

    public Ingredient save(Ingredient ingredient) {
        return pr.save(ingredient);
    }

    public Iterable <Ingredient> findAll(){
        Iterable <Ingredient> result = pr.findAll();
        return result;
    }


}
