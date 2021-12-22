package com.geststock.geststock_v1.GestionCmdClient;


import com.geststock.geststock_v1.beans.CommandeClient;
import com.geststock.geststock_v1.beans.LigneCmd;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/command")
public class CmdClientControllers {

    private CmdClientService cmdClientService;

    public CmdClientControllers(CmdClientService cmdClientService) {
        this.cmdClientService = cmdClientService;
    }

    @PostMapping("/make")
    public ResponseEntity<CommandeClient> makeCommand(@RequestBody List<LigneCmd> ligneCmd){
        CommandeClient cmd = new CommandeClient();
        cmdClientService.saveCmd(cmd);
        for (LigneCmd l : ligneCmd) {
            if (l.getQuantite() > l.getProduit().getQuantiteCmd())
                throw new CmdClientException("Stock insuffisant pour l'article " + l.getProduit().getNomArticle());


            //set cmd status, id personne,
        }
    }
}
