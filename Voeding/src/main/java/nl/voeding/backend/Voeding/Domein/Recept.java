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

}