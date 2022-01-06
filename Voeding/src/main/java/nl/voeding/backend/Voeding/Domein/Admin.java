package nl.voeding.backend.Voeding.Domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Boolean admin;

    public Admin() {
        this.admin = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
