package nl.voeding.backend.Voeding.Controller;

import nl.voeding.backend.Voeding.Domein.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository ar;

    public Admin save(Admin admin) {
        return ar.save(admin);
    }

    public Iterable <Admin> findAll(){
        Iterable <Admin> result = ar.findAll();
        return result;
    }

}
