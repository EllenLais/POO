package br.com.senai.service;

import br.com.senai.entity.EnderecoEntity;

public class EnderecoService {
    public EnderecoEntity cadastrarEndereco(String pais, String estado, String bairro, String cidade) {
        EnderecoEntity endereco = new EnderecoEntity();
        endereco.setPais(pais);
        endereco.setEstado(estado);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);

        return endereco;
    }
}

