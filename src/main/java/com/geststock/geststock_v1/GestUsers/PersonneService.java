package com.geststock.geststock_v1.GestUsers;

import com.geststock.geststock_v1.beans1.Personne;
import com.geststock.geststock_v1.GestUsers.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PersonneService {

    private final PersonneRepository personneRepository;

    @Autowired
    public PersonneService(PersonneRepository personneRepository){
        this.personneRepository = personneRepository;
    }

    public List<Personne> findAllPersonnes(){
        return personneRepository.findAll();
    }

    public Personne addPersonne(Personne p) {
        Optional<Personne> optionalPersonne = personneRepository.findPersonneByEmail(p.getEmail());
        if (optionalPersonne.isPresent()){
            throw new IllegalStateException("Email Already exists");
        }
        personneRepository.save(p);
        return p;
    }

    public void deletePersonne(Long idPersonne) {
        boolean exists = personneRepository.existsById(idPersonne);
        if (!exists){
            throw new IllegalStateException(
                    "Personne with id "+ idPersonne +" doesn't exists"
            );
        }
        personneRepository.deleteById(idPersonne);
    }

    public Personne findPersonneByIdPersonne(Long id){
        return personneRepository.findPersonneByIdPersonne(id).orElseThrow(() -> new UserNotFoundException("User with id "+id+" was not found"));
    }

    public Personne findPersonne(String login, String password){
        return personneRepository.findPersonneByLoginAndPassword(login, password).orElseThrow(() -> new UserNotFoundException("User with login "+login+" was not found"));
    }

    @Transactional
    public Personne updatePersonne(Personne newP) {
        Personne oldP = personneRepository.findById(newP.getIdPersonne()).orElseThrow(() -> new IllegalStateException("Personne with id "+newP.getIdPersonne()+" doesn't exists"));
        if (newP.getEmail() != null && newP.getEmail().length() > 0 &&
            !Objects.equals(newP.getEmail(), oldP.getEmail())) {
            Optional<Personne> p1 = personneRepository.findPersonneByEmail(newP.getEmail());
            if (p1.isPresent()){
                throw new IllegalStateException("Email taken");
            }
        }
        if (newP.getTelephone() != null && newP.getTelephone().length() > 0 &&
                !Objects.equals(newP.getTelephone(), oldP.getTelephone())) {
            Optional<Personne> p1 = personneRepository.findPersonneByPhone(newP.getTelephone());
            if (p1.isPresent()){
                throw new IllegalStateException("Phone number taken");
            }
        }
        personneRepository.save(newP);
        return newP;
    }
}
