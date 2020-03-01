package local.test.springcloud.demo.resttemplate.controller;

import local.test.springcloud.demo.resttemplate.entity.User;
import local.test.springcloud.demo.resttemplate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public Collection<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Long id){
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public Collection<User> save(@RequestBody User user){
        userRepository.saveOrUpdate(user);
        return userRepository.findAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.saveOrUpdate(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        userRepository.deleteById(id);
    }
}
