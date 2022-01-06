package nl.voeding.backend.Voeding.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.voeding.backend.Voeding.Domein.Product;
import nl.voeding.backend.Voeding.Domein.Recept;

@Component
public interface ReceptRepository extends CrudRepository <Recept, Long> {
	

}