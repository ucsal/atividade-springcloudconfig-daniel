package com.exemplo.account_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AccountController {

    @Value("${taxa.manutencao:Nao encontrado}")
    private String taxa;

    @Value("${mensagem.ambiente:Nao encontrado}")
    private String mensagem;

    @GetMapping("/info")
    public String getInfo() {
        return "Mensagem: " + mensagem + " | Taxa: " + taxa;
    }
}