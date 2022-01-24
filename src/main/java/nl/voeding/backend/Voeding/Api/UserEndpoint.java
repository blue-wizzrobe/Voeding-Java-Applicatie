package nl.voeding.backend.Voeding.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import nl.voeding.backend.Voeding.Controller.UserService;
import nl.voeding.backend.Voeding.Domein.User;

@RestController
public class UserEndpoint {

    @Autowired
    UserService us;

    @PostMapping("users")
    public User myMethod4(@RequestBody User data) {
        us.save(data);
        return data;
    }

    @GetMapping("userlijst")
    public Iterable<User> myMethod4() {
        Iterable<User> users = us.findAll();
        return users;
    }

    @GetMapping("user/{data}")
    public User myMethod4(@PathVariable String data) {
        User u = new User();
        u.setNaam(data);
        System.out.println(data);
        us.save(u);
        return u;
    }

}