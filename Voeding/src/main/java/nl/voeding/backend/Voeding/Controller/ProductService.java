package nl.voeding.backend.Voeding.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.voeding.backend.Voeding.Domein.Product;

@Service
public class ProductService {
    @Autowired
    ProductRepository pr;

    public Product save(Product product) {
        return pr.save(product);
    }

    public Iterable <Product> findAll(){
        Iterable <Product> result = pr.findAll();
        return result;
    }


}
