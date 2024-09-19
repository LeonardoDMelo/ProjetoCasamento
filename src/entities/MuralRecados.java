package entities;

import java.time.LocalDateTime;

public class MuralRecados {
    private static long serial;
    private long id;
    public Pessoa pessoa;
    public String comentario;
    public LocalDateTime dataCriacao;
    public LocalDateTime dataModificacao;

    public MuralRecados(){id = MuralRecados.serial++;}

    public long getId(){return id;}

    public Pessoa getPessoa(){return pessoa;}
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public String getComentario(){return  comentario;}

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
* MURAL_RECADOS:
id
PESSOA
comentario
dataCriacao
dataModificacao

* */