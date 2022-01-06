package nl.voeding.backend.Voeding.Domein;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ingredient {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String naam;

	@OneToMany(mappedBy = "ingredient")
	private List<Receptingredient> receptingredients;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public List<Receptingredient> getReceptingredients() {
		return receptingredients;
	}

	public void setReceptingredients(List<Receptingredient> receptingredients) {
		this.receptingredients = receptingredients;
	}
}
