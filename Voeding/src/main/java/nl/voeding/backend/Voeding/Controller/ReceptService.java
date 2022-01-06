package nl.voeding.backend.Voeding.Controller;


import nl.voeding.backend.Voeding.Domein.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptService {
    @Autowired
    ReceptRepository rr;

    public Recept save(Recept recept) {
        return rr.save(recept);
    }

    public Iterable <Recept> findAll(){
        Iterable <Recept> result = rr.findAll();
        return result;
    }

}
