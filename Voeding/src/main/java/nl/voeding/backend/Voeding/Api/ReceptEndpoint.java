package nl.voeding.backend.Voeding.Api;

import nl.voeding.backend.Voeding.Controller.ReceptService;
import nl.voeding.backend.Voeding.Domein.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping("receptaanuser/{user_id}")
	public String addUser(@PathVariable long user_id, @RequestBody Recept recept){
		System.out.println(user_id);
		System.out.println(recept.getNaam());
		rs.receptAanUser(user_id, recept);
		return "gelukt";
	}


}
