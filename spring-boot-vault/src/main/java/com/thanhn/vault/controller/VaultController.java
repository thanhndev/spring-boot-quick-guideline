package com.thanhn.vault.controller;

import com.thanhn.vault.VaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VaultController {

    @Autowired
    private VaultConfiguration vaultConfiguration;

    @GetMapping("/getDataFromVault")
    public void getDataFromVault() {
        System.out.println("DBUser ::" + vaultConfiguration.getDbuser());
        System.out.println("UserName::" + vaultConfiguration.getUsername());
        System.out.println("Password::" + vaultConfiguration.getPassword());
    }
}
