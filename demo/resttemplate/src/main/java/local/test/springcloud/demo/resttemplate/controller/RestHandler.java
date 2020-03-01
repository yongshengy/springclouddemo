package local.test.springcloud.demo.resttemplate.controller;

import local.test.springcloud.demo.resttemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    //业务方法...
    @GetMapping("/findAll")
    public Collection<User> findAll(){
        return restTemplate.getForEntity("http://localhost:8082/user/findAll", Collection.class).getBody();
    }
}
