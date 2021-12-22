package com.geststock.geststock_v1.GestionCategorie;

import com.geststock.geststock_v1.beans.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    Optional<List<Categorie>> findAllCategorie();
    Optional<Categorie> findCategorieByIdCategorie(Long id);

    Optional<Categorie> findCategorieByNomCategorie(String nom);
}
