package nl.voeding.backend.Voeding.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.voeding.backend.Voeding.Domein.Product;
import nl.voeding.backend.Voeding.Domein.Recept;

@Service
public class ReceptService {
    @Autowired
    ReceptRepository Rr;

    public Recept save(Recept recept) {
        return Rr.save(recept);
    }




}
