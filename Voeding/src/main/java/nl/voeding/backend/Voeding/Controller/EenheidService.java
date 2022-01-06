package nl.voeding.backend.Voeding.Controller;


import nl.voeding.backend.Voeding.Domein.Eenheid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EenheidService {
    @Autowired
    EenheidRepository er;

    public Eenheid save(Eenheid eenheid) {
        return er.save(eenheid);
    }

    public Iterable <Eenheid> findAll(){
        Iterable <Eenheid> result = er.findAll();
        return result;
    }

}