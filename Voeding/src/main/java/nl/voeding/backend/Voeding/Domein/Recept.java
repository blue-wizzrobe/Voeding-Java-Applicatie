package nl.voeding.backend.Voeding.Domein;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Recept {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String beschrijving;
    String naam;
    
    @ManyToMany
    List<Product> producten;

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

	public List<Product> getProducten() {
		return producten;
	}

	public void setProducten(List<Product> producten) {
		this.producten = producten;
	}

    
}
//https://0111.nl/ubuntutouch/