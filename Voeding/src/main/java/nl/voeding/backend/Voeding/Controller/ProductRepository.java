package nl.voeding.backend.Voeding.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.voeding.backend.Voeding.Domein.Product;

@Component
public interface ProductRepository extends CrudRepository <Product, Long> {
	

}
