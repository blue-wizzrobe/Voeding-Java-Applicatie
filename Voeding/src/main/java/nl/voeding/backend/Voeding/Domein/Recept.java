package nl.voeding.backend.Voeding.Domein;

import javax.persistence.*;
import java.net.URL;
import java.util.List;


@Entity
public class Recept {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String beschrijving;
    String naam;
	int bereidingstijd;
	String bereiding;
	URL afbeelding;

	@OneToMany(mappedBy = "recept")
	List<Receptingredient> receptingredients;

	@ManyToMany
	List<Eenheid> eenheden;

	public List<Receptingredient> getReceptingredients() {
		return receptingredients;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBeschrijving() {
		return beschrijving;
	}
	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}

}
