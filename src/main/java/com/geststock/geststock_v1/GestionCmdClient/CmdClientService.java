package com.geststock.geststock_v1.GestionCmdClient;

import com.geststock.geststock_v1.beans.CommandeClient;
import org.springframework.stereotype.Service;

@Service
public class CmdClientService {
    private CmdClientRepository cmdClientRepository;

    public CmdClientService(CmdClientRepository cmdClientRepository) {
        this.cmdClientRepository = cmdClientRepository;
    }

    public void saveCmd(CommandeClient cmd) {
       // CommandeClient cmdTest = cmdClientRepository.findCommandeClientById()
       // cmdClientRepository.save(cmd);
    }
}
