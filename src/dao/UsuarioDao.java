package dao;

import entities.Usuario;

import java.time.LocalDateTime;

public class UsuarioDao {

    Usuario[] usuario = new Usuario[10];

    public boolean adiciona(Usuario u){
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1){
            usuario[proximaPosicaoLivre] = u;
            return true;
        }else {
            return false;
        }
    }
    public boolean vazio()
    {
        for (Usuario usuarios : usuario){
            if (usuarios != null)
            {
                return false;
            }
        }
        return true;
    }

    public void mostrarTodos()
    {
        boolean temUsuario = false;
        for (Usuario usuarios : usuario)
        {
            if (usuarios != null)
            {
                System.out.println("ID: " +usuarios.getId());
                System.out.println("Tipo: "+usuarios.getTipo());
                System.out.println("Nome: "+usuarios.getPessoa());
                System.out.println("Login: "+usuarios.getLogin());
                System.out.println("Senha: "+usuarios.getSenha());
                System.out.println("Criacao: "+usuarios.getDataCriacao());
                System.out.println("Modificacao: "+usuarios.getDataModificacao());
            }
        }
        if (!temUsuario)
        {
            System.out.println("Nenhum usuario criado");
        }
    }

    public boolean alterarUsuario(int tipo, int novoTipo)
    {
        for (Usuario usuarios: usuario)
        {
            if (usuarios != null && usuarios.getTipo() == tipo){
                usuarios.setTipo(novoTipo);
                LocalDateTime dataAtual = LocalDateTime.now();

                usuarios.setDataModificacao(dataAtual);
            }
        }
        return false;
    }

    Usuario buscarPorLogin(String login)
    {
        for (Usuario usuarios: usuario){
            if (usuarios != null && usuarios.getLogin().equals(login)){
                return usuarios;
            }
        }
        return null;
    }

    public boolean remover(String login){
        for (int i = 0;i < usuario.length;i++){
            if (usuario[i] != null && usuario[i].getLogin().equals(login)){
                usuario[i] = null;
                return true;
            }
        }
        return false;
    }

    private  int proximaPosicaoLivre(){
        for (int i = 0;i < usuario.length;i++){
            if (usuario[i] == null)
            {
                return i;
            }
        }
        return -1;
    }

    public  UsuarioDao(){
        LocalDateTime dataCriacao = LocalDateTime.now();

        Usuario usuario1 = new Usuario();

        usuario1.setLogin("leonardo10");
        usuario1.setSenha("1234");
        usuario1.setTipo(1);
        usuario1.setDataCriacao(dataCriacao);

        adiciona(usuario1);

    }
















}
