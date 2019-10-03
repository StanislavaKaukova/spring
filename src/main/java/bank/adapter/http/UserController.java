package bank.adapter.http;

import bank.core.User;
import bank.core.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

//    @PostMapping
//    public String register(@RequestParam String name, @RequestParam String email) {
//        User user = new User();
//        user.setName(name);
//        user.setEmail(email);
//        user.setRegisteredOn(new Date());
//        repository.save(user);
//        return "Successful";
//    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserDto> getUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        Iterable<User> users = repository.findAll();
        users.iterator().forEachRemaining(each -> result.add(new UserDto(each.getId(), each.getName(), each.getEmail(), each.getRegisteredOn())));
        return result;
    }
}
