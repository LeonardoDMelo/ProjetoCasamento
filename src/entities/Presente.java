package entities;

import java.time.LocalDateTime;

public class Presente {
    private static long serial;
    private long id;
    public String nomePresente;
    public int tipo;
    public double valor;
    public Pessoa pessoa;
    public LocalDateTime dataCriacao;
    public LocalDateTime dataModificacao;

    public Presente(){id = Presente.serial++;}

    public long getId(){return id;}

    public String getNomePresente() {
        return nomePresente;
    }
    public void setNomePresente(String nomePresente) {
        this.nomePresente = nomePresente;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }


}

/*
* PRESENTES:
id
nome
tipo
valor
PESSOA
dataCriacao
dataModificacao

* */
