package nl.voeding.backend.Voeding.Domein;

import javax.persistence.*;
import java.util.List;

@Entity
public class Eenheid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String eenheid;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEenheid() {
        return eenheid;
    }
    public void setEenheid(String eenheid) {
        this.eenheid = eenheid;
    }
}
