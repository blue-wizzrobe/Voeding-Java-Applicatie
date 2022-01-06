package nl.voeding.backend.Voeding.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.voeding.backend.Voeding.Controller.ReceptService;
import nl.voeding.backend.Voeding.Domein.Ingredient;
import nl.voeding.backend.Voeding.Domein.Recept;

@RestController
public class ReceptEndpoint {
	
	@Autowired
	private ReceptService rs;
	
	@GetMapping("recept/{receptnaam}")
	public void slaReceptOp(@PathVariable String receptnaam) {
		Recept r = new Recept();
        r.setNaam(receptnaam);
        System.out.println(receptnaam);
        rs.save(r);
	}

}
