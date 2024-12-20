package com.example.apiRest.Controllers;

import com.example.apiRest.Models.User;
import com.example.apiRest.Repositories.UserRepository;
import com.example.apiRest.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository _userRepository;

    //Metodos
    @GetMapping("/index")
    public ResponseEntity<List<User>> index() {
        List<User> users = new UserService(_userRepository).index();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user) {
        User userCreated = new UserService(_userRepository).create(user);
        return new ResponseEntity<>(userCreated, HttpStatus.OK);
    }

    //Put
    @PutMapping("/update/{id}")
    public ResponseEntity<User> update(@PathVariable int id, @RequestBody User user) {
        User userUpdated = new UserService(_userRepository).update(id, user);
        return new ResponseEntity<>(userUpdated, HttpStatus.OK);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> delete(@PathVariable int id) {
        User userDeleted = new UserService(_userRepository).delete(id);
        return new ResponseEntity<>(userDeleted, HttpStatus.OK);
    }

    //Search by id
    @GetMapping("/searchId/{id}")
    public ResponseEntity<List<User>> searchId(@PathVariable int id) {
        List<User> users = new UserService(_userRepository).searchId(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //Search by name
    @GetMapping("/searchName/{name}")
    public ResponseEntity<List<User>> searchName(@PathVariable String name) {
        List<User> users = new UserService(_userRepository).searchName(name);
        if (users.size() == 0) {
            return new ResponseEntity<>(users, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //Search by email
    @GetMapping("/searchEmail/{email}")
    public ResponseEntity<List<User>> searchEmail(@PathVariable String email) {
        List<User> users = new UserService(_userRepository).searchEmail(email);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //Get o Post(Body) para llamar a las preguntas y logica de destino
    //Traer los destinos de las DB
}
