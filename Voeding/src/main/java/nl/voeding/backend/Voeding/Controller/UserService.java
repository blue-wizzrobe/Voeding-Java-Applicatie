package nl.voeding.backend.Voeding.Controller;


import nl.voeding.backend.Voeding.Domein.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository ur;

    public User save(User user) {
        return ur.save(user);
    }

    public Iterable <User> findAll(){
        Iterable <User> result = ur.findAll();
        return result;
    }


}
