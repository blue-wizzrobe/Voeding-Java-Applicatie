package nl.voeding.backend.Voeding.Domein;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recept {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String beschrijving;
    private String naam;
	private int bereidingstijd;
	@Column(length=512)
	private String bereiding;
	private String afbeelding;

	@OneToMany(mappedBy = "recept")
	private List<Receptingredient> receptingredients;

	@ManyToOne
//	@JoinColumn(name = "user_id")
	private User user;

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

	public int getBereidingstijd() {
		return bereidingstijd;
	}

	public void setBereidingstijd(int bereidingstijd) {
		this.bereidingstijd = bereidingstijd;
	}

	public String getBereiding() {
		return bereiding;
	}

	public void setBereiding(String bereiding) {
		this.bereiding = bereiding;
	}

	public String getAfbeelding() {
		return afbeelding;
	}

	public void setAfbeelding(String afbeelding) {
		this.afbeelding = afbeelding;
	}

	public List<Receptingredient> getReceptingredients() {
		return receptingredients;
	}

	public void setReceptingredients(List<Receptingredient> receptingredients) {
		this.receptingredients = receptingredients;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}