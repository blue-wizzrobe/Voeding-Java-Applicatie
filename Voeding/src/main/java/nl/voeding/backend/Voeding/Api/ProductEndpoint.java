package nl.voeding.backend.Voeding.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import nl.voeding.backend.Voeding.Controller.ProductService;
import nl.voeding.backend.Voeding.Domein.Product;

@RestController
public class ProductEndpoint {

    @Autowired
    ProductService ps;

    @PostMapping("producten")
    public Product myMethod4(@RequestBody Product data) {
        ps.save(data);
        return data;
    }

    @GetMapping("product/{data}")
    public Product myMethod4(@PathVariable String data) {
        Product p = new Product();
        p.setNaam(data);
        System.out.println(data);
        ps.save(p);
        return p;
    }
}
