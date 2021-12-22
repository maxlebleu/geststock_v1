package com.geststock.geststock_v1.GestionCmdClient;

import com.geststock.geststock_v1.beans.LigneCmd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface LigneCmdClientRepository extends JpaRepository<LigneCmd, Long> {

    @Query("SELECT l from LigneCmd l where l.idLigneCmd = ?1 and l.article.idArticle = ?2")
    Optional<LigneCmd> findLigneCmdsByIdAndArticleAndPersonne(Long id, Long article, Long personne);

}
