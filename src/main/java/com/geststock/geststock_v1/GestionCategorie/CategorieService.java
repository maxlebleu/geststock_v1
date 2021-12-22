package com.geststock.geststock_v1.GestionCategorie;

import com.geststock.geststock_v1.beans.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    private CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public List<Categorie> getAllCategorie(){
        return categorieRepository.findAllCategorie().orElseThrow(()-> new IllegalStateException("Une erreur est survenue"));
    }

    public Categorie getCategorieById(Long idCategorie){
        return categorieRepository.findCategorieByIdCategorie(idCategorie).orElseThrow(() -> new IllegalStateException("Categorie with id "+idCategorie+" doesn't exists"));
    }
    public Categorie addCategorie(Categorie c) {
        if (categorieRepository.findCategorieByNomCategorie(c.getNomCategorie()).isPresent())
            throw new IllegalStateException("La Categorie nommée "+c.getNomCategorie()+" existe deja");
        return categorieRepository.save(c);
    }

    public Categorie updateCategorie(Categorie c){
        Categorie cat = getCategorieById(c.getIdCategorie());
        if ((cat.getIdCategorie() == c.getIdCategorie()) && (!categorieRepository.findCategorieByNomCategorie(c.getNomCategorie()).isPresent())){
            categorieRepository.save(c);
        }
        else {
            throw new IllegalStateException("La Categorie nommée "+c.getNomCategorie()+" existe deja");
        }
        return c;
    }

    public Categorie getCategorieByName(String nomCategorie) {
        return categorieRepository.findCategorieByNomCategorie(nomCategorie).orElseThrow(
                () -> new IllegalStateException("La Categorie nommée "+nomCategorie+" n'existe pas"));
    }

    public void deleteCategorie(Long idCategorie){
        categorieRepository.deleteById(getCategorieById(idCategorie).getIdCategorie());
    }
}
