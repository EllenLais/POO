package br.com.senai.entity;

public class PessoaEntity {
    private String nome;        //atributo nome
    private String cpf;         //atributo cpf
    private String email;       //atributo e-mail
    private int idade;          //atributo idade
    private double altura;      //atributo altura

    private EnderecoEntity endereco;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public void setEndereco(EnderecoEntity endereco){
        this.endereco = endereco;
    }

    public EnderecoEntity getEndereco(){
        return endereco;
    }


}

