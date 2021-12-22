package com.geststock.geststock_v1.GestUsers;

import com.geststock.geststock_v1.beans1.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

    @Query("SELECT p from Personne p where p.email=?1")
    Optional<Personne> findPersonneByEmail(String email);

    @Query("SELECT p from Personne p where p.telephone = ?1")
    Optional<Personne> findPersonneByPhone(String phone);

    Optional<Personne> findPersonneByIdPersonne(Long id);

    @Query("SELECT p FROM Personne p where p.login = ?1 and p.password = ?2")
    Optional<Personne> findPersonneByLoginAndPassword(String login, String password);

    void deletePersonneByIdPersonne(Long id);
}
