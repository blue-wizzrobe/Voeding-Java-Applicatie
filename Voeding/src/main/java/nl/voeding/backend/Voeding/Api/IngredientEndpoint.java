package nl.voeding.backend.Voeding.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nl.voeding.backend.Voeding.Controller.IngredientService;
import nl.voeding.backend.Voeding.Domein.Ingredient;

@RestController
public class IngredientEndpoint {

    @Autowired
    IngredientService ps;

    @PostMapping("producten")
    public Ingredient myMethod4(@RequestBody Ingredient data) {
        ps.save(data);
        return data;
    }

    @GetMapping("productlijst")
    public Iterable<Ingredient> myMethod4() {
        Iterable<Ingredient> products = ps.findAll();
        return products;
    }

    @GetMapping("product/{data}")
    public Ingredient myMethod4(@PathVariable String data) {
        Ingredient p = new Ingredient();
        p.setNaam(data);
        System.out.println(data);
        ps.save(p);
        return p;
    }
}
