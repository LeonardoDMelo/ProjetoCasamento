package dao;

import entities.Pessoa;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class PessoaDao {

    Pessoa[] pessoa = new Pessoa[10];

    public boolean adiciona(Pessoa p){
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if(proximaPosicaoLivre != -1){
            pessoa[proximaPosicaoLivre] = p;
            return true;
        } else {
            return false;
        }
    }

    public boolean vazio(){
        for (Pessoa pessoas : pessoa){
            if (pessoas != null)
            {
                return false;
            }
        }
        return true ;
    }

    public void mostrarTodos(){
        boolean temPessoa = false;
        for (Pessoa pessoas : pessoa){
            if (pessoas != null){
                System.out.println("ID: " +pessoas.getId());
                System.out.println("Nome: "+pessoas.getNome());
                System.out.println("Nascimento: "+pessoas.getNascimento());
                System.out.println("Telefone: "+pessoas.getTelefone());
                System.out.println("------------------------");
                temPessoa = true;
            }
        }
        if (!temPessoa){
            System.out.println("Nenhuma pessoa criada");
        }
    }

    public  boolean alterarNome(String nome, String novoNome){
        for (Pessoa pessoas : pessoa){
            if (pessoas != null && pessoas.getNomePessoa().equals(nome)){
                pessoas.setNomePessoa(novoNome);
                LocalDateTime dataAtual = LocalDateTime.now();

                pessoas.setDataModificacao(dataAtual);
            }
        }
        return false;
    }

    Pessoa buscarPorNome(String nome){
        for (Pessoa pessoas : pessoa){
            if(pessoas != null && pessoas.getNomePessoa().equals(nome)){
                return pessoas;
            }
        }
        return null;
    }

    public boolean remover(String nome){
        for (int i = 0;i < pessoa.length;i++)
        {
            if (pessoa[i] != null && pessoa[i].getNomePessoa().equals(nome)){
                pessoa[i] = null;
                return true;

            }
        }
        return false;
    }

    private int proximaPosicaoLivre(){
        for (int i = 0;i < pessoa.length;i++){
            if (pessoa[i] == null){
                return i;
            }
        }
        return -1;
    }


    public  PessoaDao(){
        //LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime dataCriacao = LocalDateTime.now();

        Pessoa pessoa1 = new Pessoa();


        pessoa1.setNomePessoa("Leonardo");
        pessoa1.setNascimento("16/09/1999");
        pessoa1.setTelefone("(34)991761513");
        pessoa1.setDataCriacao(dataCriacao);

        adiciona(pessoa1);

    }

}
