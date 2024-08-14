package br.com.senai.controller;

import br.com.senai.entity.EnderecoEntity;
import br.com.senai.service.EnderecoService;

public class EnderecoController {
    EnderecoService enderecoService = new EnderecoService();

    public EnderecoEntity cadastrarEndereco(
            String pais, String estado, String bairro, String cidade) {
        return enderecoService.cadastrarEndereco(
                pais, estado, bairro, cidade);
    }
}

