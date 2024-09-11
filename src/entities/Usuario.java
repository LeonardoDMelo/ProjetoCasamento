package entities;


import java.time.LocalDateTime;

public class Usuario {
    private static long serial;
    private  long id;
    private Pessoa pessoa;
    private int tipo;
    private String login;
    private String senha;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;


    //Cria id automaticamente e aumenta +1 a cada usuario criado
    public Usuario(){id = Usuario.serial++;}

    public Pessoa getPessoa(){return pessoa;}

    public void setPessoa(Pessoa pessoa)
    {
        this.pessoa = pessoa;
    }

    public long getId(){return id;}

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo)
    {
        this.tipo = tipo;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public LocalDateTime getDataCriacao(){
        return  dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataModificacao(){
        return dataModificacao;
    }

    public void setDataModificacao(LocalDateTime dataModificacao){
        this.dataModificacao = dataModificacao;
    }
}


/*
* USUÁRIO:
id
PESSOA
tipo
login
senha
dataCriacao
dataModificacao

* */
