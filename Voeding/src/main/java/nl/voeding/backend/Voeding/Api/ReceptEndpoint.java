package nl.voeding.backend.Voeding.Api;

import nl.voeding.backend.Voeding.Controller.ReceptService;
import nl.voeding.backend.Voeding.Domein.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping("receptenlijst")
	public Iterable<Recept> myMethod4() {
		Iterable<Recept> recepten = rs.findAll();
		return recepten;
	}

}
