package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa {
    private static long serial;
    private long id;
    private String nomePessoa;
    private String nascimento;
    private String telefone;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Pessoa(){
        id = Pessoa.serial++;
    }

    public long getId(){
        return id;
    }

    public String getNomePessoa(){
        return nome;
    }

    public void setNomePessoa(String nome){
        this.nome = nome;
    }

    public String getNascimento(){
        return nascimento;
    }

    public void setNascimento(String Nascimento){
        this.nascimento = nascimento;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
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
* id
*nascimento
*telefone
*dataCriação
*dataModificacao
 */