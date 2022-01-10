package nl.voeding.backend.Voeding.Domein;

import javax.persistence.*;
import java.util.List;

@Entity
public class Receptingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "recept_id")
    private Recept recept;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @ManyToMany
    private List<Eenheid> eenheden;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Recept getRecept() {
        return recept;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public List<Eenheid> getEenheden() {
        return eenheden;
    }

    public void setEenheden(List<Eenheid> eenheden) {
        this.eenheden = eenheden;
    }
}