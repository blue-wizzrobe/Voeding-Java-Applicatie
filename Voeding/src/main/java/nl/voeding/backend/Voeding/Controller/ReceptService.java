package nl.voeding.backend.Voeding.Controller;


import nl.voeding.backend.Voeding.Domein.Recept;
import nl.voeding.backend.Voeding.Domein.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReceptService {
    @Autowired
    ReceptRepository rr;

    @Autowired
    UserRepository ur;

    public Recept save(Recept recept) {
        return rr.save(recept);
    }

    public Iterable <Recept> findAll(){
        Iterable <Recept> result = rr.findAll();
        return result;
    }

    public void receptAanUser(long userId, Recept recept) {
        User user = ur.findById(userId).get();
        recept.setUser(user);
        rr.save(recept);
    }

}
