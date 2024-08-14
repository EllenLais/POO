package br.com.senai.service;

import br.com.senai.entity.EnderecoEntity;
import br.com.senai.entity.PessoaEntity;

import java.util.List;
import java.util.Scanner;

public class PessoaService {
    Scanner tec = new Scanner(System.in);

    public PessoaEntity cadastrarPessoa(String nome, String cpf, String email, int idade, double altura){
        //Instânciando objeto PessoaEntity
        PessoaEntity pessoaEntity = new PessoaEntity();

        //pessoaEntity.nome = Pedro;
        pessoaEntity.setNome(nome);
        pessoaEntity.setCpf(cpf);
        pessoaEntity.setEmail(email);
        pessoaEntity.setIdade(idade);
        pessoaEntity.setAltura(altura);
        return pessoaEntity;
    }

    public PessoaEntity cadastrarPessoa(String nome, String cpf, String email, int idade, double altura, EnderecoEntity endereco) {
        PessoaEntity pessoaEntity = new PessoaEntity();

        pessoaEntity.setNome(nome);
        pessoaEntity.setCpf(cpf);
        pessoaEntity.setEmail(email);
        pessoaEntity.setIdade(idade);
        pessoaEntity.setAltura(altura);
        pessoaEntity.setEndereco(endereco);
        return pessoaEntity;
    }

    public void listarPessoas(List<PessoaEntity> pessoas){
        System.out.println("Pessoas cadastradas");
        pessoas.forEach(pessoa -> {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("E-Mail: " + pessoa.getEmail());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("--- ENDEREÇO ---");
            System.out.println("Pais: " + pessoa.getEndereco().getPais());
            System.out.println("Estado: " + pessoa.getEndereco().getEstado());
            System.out.println("Bairro: " + pessoa.getEndereco().getBairro());
            System.out.println("Cidade: " + pessoa.getEndereco().getCidade());
            System.out.println("------------------");
        });
    }

    public void buscarPessoa(){
    }

    public PessoaEntity editarPessoa(PessoaEntity pessoaEntity){
        System.out.print("Informe o novo nome: ");
        String nome = tec.nextLine();
        pessoaEntity.setNome(nome);
        return pessoaEntity;
    }

    public void removerPessoa(){

    }
}

