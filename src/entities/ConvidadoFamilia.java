package entities;

import java.time.LocalDateTime;

public class ConvidadoFamilia {
    private static long serial;
    private long id;
    public String nomeFamilia;
    public String acesso;
    public LocalDateTime dataCriacao;
    public LocalDateTime dataModificacao;

    public ConvidadoFamilia(){id = ConvidadoFamilia.serial++;}

    public long getId(){return id;}

    public String getNomeFamilia() {
        return nomeFamilia;
    }
    public void setNomeFamilia(String nomeFamilia) {
        this.nomeFamilia = nomeFamilia;
    }

    public String getAcesso() {
        return acesso;
    }
    public void setAcesso(String acesso) {
        this.acesso = acesso;
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
* CONVIDADO_FAMILIA: convite p/ familia
id
nome_familia
acesso
dataCriacao
dataModificacao
deve haver concatenação: primeiro_nome_noivo + primeiro_nome_noiva + DiaMesAno + letras.
 O acesso deve ser fornecido a família.
 O titular da família acessa o ambiente logado e
 confirma a sua presença ou não. Esta confirmação modifica o convite individual.
 *
* */