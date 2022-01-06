package nl.voeding.backend.Voeding.Domein;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String naam;
	private String wachtwoord;
	private String email;

	@ManyToMany
	private List<Recept> bewaardeRecepten;

	@OneToMany(mappedBy = "user")
	private List<Recept> gemaakteRecepten;

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

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Recept> getBewaardeRecepten() {
		return bewaardeRecepten;
	}

	public void setBewaardeRecepten(List<Recept> bewaardeRecepten) {
		this.bewaardeRecepten = bewaardeRecepten;
	}

	public List<Recept> getGemaakteRecepten() {
		return gemaakteRecepten;
	}

	public void setGemaakteRecepten(List<Recept> gemaakteRecepten) {
		this.gemaakteRecepten = gemaakteRecepten;
	}
}
