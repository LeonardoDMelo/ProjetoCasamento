package entities;

import java.time.LocalDateTime;

public class ConvidadoIndividual {
    private static long serial;
    private long id;
    public Pessoa pessoa;
    public ConvidadoFamilia convidadoFamilia;
    public String parentesco;
    public boolean confirmacao;
    public LocalDateTime dataCriacao;
    public LocalDateTime dataModificacao;

    public ConvidadoIndividual(){id = ConvidadoIndividual.serial++;}

    public long getId(){return id;}

    public Pessoa getPessoa(){return pessoa;}

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ConvidadoFamilia getConvidadoFamilia() {
        return convidadoFamilia;
    }

    public void setConvidadoFamilia(ConvidadoFamilia convidadoFamilia) {
        this.convidadoFamilia = convidadoFamilia;
    }

    public boolean isConfirmacao() {
        return confirmacao;
    }

    public void setConfirmacao(boolean confirmacao) {
        this.confirmacao = confirmacao;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
}

/*
* CONVIDADO_INDIVIDUAL: convite individual
id
PESSOA
FAMILIA
parentesco
confirmação(V/F)
dataCriação
dataModificação
*/