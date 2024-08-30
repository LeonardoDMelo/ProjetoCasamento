package general;

import dao.PessoaDao;
import entities.Pessoa;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Scanner;


public class ProgramaPessoa {
    private PessoaDao PessoaDao;
    public ProgramaPessoa(PessoaDao PessoaDao){
        this.PessoaDao = PessoaDao;
    }
    Scanner s = new Scanner(System.in);
    public  void mostrarMenu() {
        int opcaoUsuario;


        do {
            opcaoUsuario = pegaOpcaoUsuario();
            switch (opcaoUsuario) {
                case 1:
                    Pessoa j = criaPessoa();

                    boolean pessoaFoiInserida = PessoaDao.adiciona(j);
                    if (pessoaFoiInserida) {
                        System.out.println("Pessoa inserida");
                    } else {
                        System.out.println("Pessoa não inserida");
                    }

                    break;

                case 2:
                    PessoaDao.mostrarTodos();
                    break;

                case 3:
                    System.out.println("Pessoa procurada: ");
                    String procurado = s.nextLine();
                    System.out.println("Novo nome: ");
                    String novoNome = s.nextLine();

                    if (PessoaDao.alterarNome(procurado, novoNome)) {
                        System.out.println("Pessoa alterado");
                    } else {
                        System.out.println("Pessoa não encontrado");
                    }

                    break;

                case 4:
                    System.out.println("Pessoa procurado: ");
                    String nomeExclusao = s.nextLine();

                    if (PessoaDao.remover(nomeExclusao)) {
                        System.out.println("Pessoa excluida");
                    } else {
                        System.out.println("Pessoa não excluida");
                    }

                    break;

                case 5:
                    System.out.println("nada aqui");

                default:
                    System.out.println("Saindo...");
            }
        } while (opcaoUsuario != 5);
    }

        private Pessoa criaPessoa(){
            Pessoa j = new Pessoa();
            LocalDateTime dataAtual = LocalDateTime.now();

            System.out.println("\nNome: ");
            String nome = s.nextLine();
            j.setNomePessoa(nome);

            System.out.println("Telefone: ");
            String telefone = s.nextLine();

            System.out.println("Data de Nascimento: ");
            LocalDateTime nascimento = LocalDateTime.parse(s.nextLine());

            j.setDataCriacao(dataAtual);


            return j;
        }



        private  int pegaOpcaoUsuario(){
            System.out.println("1 Cadastrar");
            System.out.println("1 Mostrar todos");
            System.out.println("3 Alterar o nome da pessoa");
            System.out.println("4 Excluir pelo id");
            System.out.println("5 sair");
            System.out.println("Qual sua opcao: ");

            return Integer.parseInt(s.nextLine());
        }



}
