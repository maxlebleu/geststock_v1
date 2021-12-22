package com.geststock.geststock_v1.GestUsers;

import com.geststock.geststock_v1.beans1.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "GestStock/Personne")
public class PersonneControllers {

    private final PersonneService personneService;

    @Autowired
    public PersonneControllers(PersonneService personneService){
        this.personneService = personneService;
    }
    //@GetMapping(path = "GestStock/Personne")
    public List<Personne> getPersonne() {
        //return "page/personne";
        return personneService.findAllPersonnes();
    }

    @RequestMapping(value = "/personneData", method = RequestMethod.POST)
    public @ResponseBody String verifyPersonne(@RequestParam String param){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(param);
        System.out.println();
        System.out.println();
        System.out.println();
        return param;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Personne>> getAllPersonne(){
        List<Personne> personnes = personneService.findAllPersonnes();
        return new ResponseEntity<>(personnes, HttpStatus.OK);
    }

    @PostMapping("/auth")
    public ResponseEntity<Personne> getPersonne(@RequestBody Map personne){
        Personne p = new Personne();
        System.out.println();
        System.out.println();
        System.out.println(personne.get("login").toString());
        System.out.println(personne.get("password").toString());
        System.out.println();
        System.out.println();
        String log = personne.get("login").toString();
        String pass = personne.get("password").toString();
        p = personneService.findPersonne(log, pass);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Personne> getPersonneById(@PathVariable("id") Long id){
        Personne p = personneService.findPersonneByIdPersonne(id);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Personne> savePersonne(@RequestBody Personne p) {
        Personne p1 = personneService.addPersonne(p);
        return new ResponseEntity<>(p1, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Personne> updatePersonne(@RequestBody Personne p) {
        Personne p1 = personneService.updatePersonne(p);
        return new ResponseEntity<>(p1, HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete/{idPersonne}")
    public ResponseEntity<Personne> deletePersonne(@PathVariable("idPersonne") Long idPersonne){
        personneService.deletePersonne(idPersonne);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /*@PutMapping(path = "{idPersonne}")
    public void updatePersonne(@PathVariable("idPersonne") Long id,
                               @RequestParam(required = false) String email,
                               @RequestParam(required = false) String phone) {
        Personne p = new Personne(id);

        personneService.updatePersonne(id, email, phone);
    }*/
//    public String personneData(@RequestParam(required = false, defaultValue = "World") String name, ModelMap modelMap){
//        modelMap.put("name", name);
//        return "page/personne";
//    }
}
