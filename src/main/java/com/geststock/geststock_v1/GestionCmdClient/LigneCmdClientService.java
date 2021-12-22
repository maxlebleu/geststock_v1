package com.geststock.geststock_v1.GestionCmdClient;

import com.geststock.geststock_v1.beans.LigneCmd;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LigneCmdClientService {

    private LigneCmdClientRepository ligneCmdClientRepository;

    public void saveLigneCmd(LigneCmd lc){

        /*Optional<LigneCmd> lcmd = ligneCmdClientRepository.findLigneCmdsByIdAndArticleAndPersonne(lc.getIdLigneCmd(), lc.getIdArticle(), lc.);
        if (lcmd.isPresent()){
            throw new IllegalStateException("");
        }
        ligneCmdClientRepository.save(lc);*/
    }

    public void updateLigneCmd(LigneCmd lc){
        /*Optional<LigneCmd> lcmd = ligneCmdClientRepository.findLigneCmdsByIdAndArticleAndPersonne(lc.getIdLigneCmd(), lc.getProduit().getIdArticle(), lc.);
        if (lcmd.isPresent())
            ligneCmdClientRepository.save(lc);
        throw new IllegalStateException("The article with id "+lc.getProduit().getIdArticle()+" n'existe pas");
    */}

}
