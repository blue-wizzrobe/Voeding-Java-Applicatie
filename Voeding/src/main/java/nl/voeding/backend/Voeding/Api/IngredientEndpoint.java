package nl.voeding.backend.Voeding.Api;

import nl.voeding.backend.Voeding.Controller.IngredientService;
import nl.voeding.backend.Voeding.Domein.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IngredientEndpoint {

    @Autowired
    IngredientService is;

    @PostMapping("ingredienten")
    public Ingredient myMethod4(@RequestBody Ingredient data) {
        is.save(data);
        return data;
    }

    @GetMapping("ingredientenlijst")
    public Iterable<Ingredient> myMethod4() {
        Iterable<Ingredient> ingredienten = is.findAll();
        return ingredienten;
    }

    @GetMapping("ingredient/{data}")
    public Ingredient myMethod4(@PathVariable String data) {
        Ingredient i = new Ingredient();
        i.setNaam(data);
        System.out.println(data);
        is.save(i);
        return i;
    }

}