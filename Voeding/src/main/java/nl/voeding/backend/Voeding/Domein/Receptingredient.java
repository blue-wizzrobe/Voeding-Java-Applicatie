package nl.voeding.backend.Voeding.Domein;

import javax.persistence.*;

@Entity
public class Receptingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne
    @JoinColumn(name = "recept_id")
    private Recept recept;


    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    public Ingredient ingredient;

}
