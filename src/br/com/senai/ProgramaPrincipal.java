package br.com.senai;

import br.com.senai.controller.EnderecoController;
import br.com.senai.controller.PessoaController;
import br.com.senai.entity.EnderecoEntity;
import br.com.senai.entity.PessoaEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        List<PessoaEntity> pessoas = new ArrayList<>();

        boolean repetir = true;
        int opcao;

        String nome;
        String cpf;
        String email;
        int idade;
        double altura;

        String pais;
        String estado;
        String bairro;
        String cidade;

        //Instanciando objeto PessoaController
        PessoaController pessoaController = new PessoaController();
        EnderecoController enderecoController = new EnderecoController();

        do{
            System.out.println("---MENU---");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Editar pessoa");
            System.out.println("3 - Listar pessoas");
            System.out.println("4 - Buscar pessoa");
            System.out.println("5 - Remover pessoa");
            System.out.println("6 - Encerrar a aplicação");
            System.out.print("Informe a opção desejada: ");
            opcao = tec.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("---Cadastrar Pessoa---");
                    System.out.print("Informe o nome: ");
                    tec.nextLine();
                    nome = tec.nextLine();
                    System.out.print("Informe o CPF: ");
                    cpf = tec.nextLine();
                    System.out.print("Informe a idade: ");
                    idade = tec.nextInt();
                    System.out.print("Informe o e-mail: ");
                    tec.nextLine();
                    email = tec.nextLine();
                    System.out.print("Informe a altura: ");
                    altura = tec.nextDouble();

                    System.out.print("Informe o pais: ");
                    tec.nextLine();
                    pais = tec.nextLine();
                    System.out.print("Informe o estado: ");
                    estado = tec.nextLine();
                    System.out.print("Informe o bairro: ");
                    bairro = tec.nextLine();
                    System.out.print("Informe a cidade: ");
                    cidade = tec.nextLine();

                    EnderecoEntity endereco = enderecoController.cadastrarEndereco(pais, estado, bairro, cidade);

//                    PessoaEntity pessoaEntity = pessoaController.cadastrarPessoa(nome, cpf, email, idade, altura);
                    PessoaEntity pessoaEntity = pessoaController.cadastrarPessoa(nome, cpf, email, idade, altura, endereco);
                    pessoas.add(pessoaEntity);
                    break;

                case 2:
                    System.out.println("---Editar Pessoa---");
                    System.out.print("Informe o id da pessoa: ");
                    int id = tec.nextInt();
                    if (id >= pessoas.size() || id < 0){
                        System.out.println("Pessoa não cadastrada!!!");
                        break;
                    }

                    PessoaEntity pessoaEntityEdit = pessoas.get(id);
                    PessoaEntity pessoaEditada = pessoaController.editarPessoa(pessoaEntityEdit);
                    pessoas.set(id, pessoaEditada);
                    break;

                case 3:
                    System.out.println("---Listar Pessoas");
                    pessoaController.listarPessoas(pessoas);
                    break;

                case 4:
                    System.out.println("---Buscar Pessoa---");
                    break;

                case 5:
                    System.out.println("---Remover Pessoa---");
                    break;

                case 6:
                    repetir = false;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (repetir);

        System.out.println("Encerrando a aplicação ...");
        tec.close();
    }
}

