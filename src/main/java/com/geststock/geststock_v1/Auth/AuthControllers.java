package com.geststock.geststock_v1.Auth;

import com.geststock.geststock_v1.beans.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/login")
public class AuthControllers {

    private final AuthService authService;

    @Autowired
    public AuthControllers(AuthService authService){
        this.authService = authService;
    }

   /* @PostMapping()
    public ResponseEntity<Personne> logIn(@RequestBody Map personne){
        Personne p = new Personne();

        System.out.println(personne.get("login").toString());
        System.out.println(personne.get("password").toString());

        String log = personne.get("login").toString();
        String pass = personne.get("password").toString();
        p = authService.findPersonne(log, pass);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }*/
}
