package com.geststock.geststock_v1.GestionCategorie;

import com.geststock.geststock_v1.beans.Categorie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("GestStock/produit/categorie")
public class CategorieControllers {
    private CategorieService categorieService;

    public CategorieControllers(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping
    public List<Categorie> getCategories() {
        return categorieService.getAllCategorie();
    }

    @PostMapping("/addCategorie")
    public ResponseEntity<Categorie> addCategorie(@RequestBody Categorie c) {
        Categorie cat = categorieService.addCategorie(c);
        return new ResponseEntity<>(cat, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Categorie> updateCategorie(@RequestBody Categorie c) {
        Categorie cat = categorieService.updateCategorie(c);
        return new ResponseEntity<>(cat, HttpStatus.OK);
    }

    @GetMapping("/find/{nomCategorie}")
    public ResponseEntity<Categorie> getCategorieByName(@PathVariable("nomCategorie") String nomCategorie){
        Categorie c = categorieService.getCategorieByName(nomCategorie);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idCategorie}")
    public ResponseEntity<Categorie> deleteCategorie(@PathVariable("idCategorie") Long idCategorie){
        categorieService.deleteCategorie(idCategorie);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
