package nl.voeding.backend.Voeding.Api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.voeding.backend.Voeding.Controller.ReceptRepository;
import nl.voeding.backend.Voeding.Domein.Recept;

@RestController
public class FelixEndpoint {

	@Autowired
	ReceptRepository rr;
	
	@GetMapping("/getReceptById/{id}")
	public Recept getReceptById(@PathVariable int id) {
		System.out.println(id);
		long idl = id;
		return rr.findById(idl).get();
	}
}
