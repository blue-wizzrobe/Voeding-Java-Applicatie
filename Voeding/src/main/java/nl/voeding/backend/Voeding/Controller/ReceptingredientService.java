package nl.voeding.backend.Voeding.Controller;


import nl.voeding.backend.Voeding.Domein.Receptingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptingredientService {
    @Autowired
    ReceptingredientRepository rir;

    public Receptingredient save(Receptingredient receptingredient) {
        return rir.save(receptingredient);
    }

    public Iterable <Receptingredient> findAll(){
        Iterable <Receptingredient> result = rir.findAll();
        return result;
    }

}
