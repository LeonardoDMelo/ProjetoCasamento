package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Eventos {

    private static long serial;
    private long id;
    private LocalDateTime dataEvento;
    private Cerimonial cerimonial;
    private Igreja igreja;
    private Cartorio cartorio;
    private String pessoaNoiva;
    private String pessoaNoivo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Eventos(){id = Eventos.serial++;}

    public long getId(){return id;}


    public LocalDateTime getDataEvento(){return dataEvento;}

    public void setDataEvento(LocalDateTime dataEvento){
        this.dataEvento = dataEvento;
    }

    public Cerimonial getCerimonial() {
        return cerimonial;
    }

    public void setCerimonial(Cerimonial cerimonial) {
        this.cerimonial = cerimonial;
    }

    public Igreja getIgreja() {
        return igreja;
    }

    public void setIgreja(Igreja igreja) {
        this.igreja = igreja;
    }

    public Cartorio getCartorio() {
        return cartorio;
    }

    public void setCartorio(Cartorio cartorio) {
        this.cartorio = cartorio;
    }

    public String getPessoaNoiva() {
        return pessoaNoiva;
    }

    public void setPessoaNoiva(String pessoaNoiva) {
        this.pessoaNoiva = pessoaNoiva;
    }

    public String getPessoaNoivo() {
        return pessoaNoivo;
    }

    public void setPessoaNoivo(String pessoaNoivo) {
        this.pessoaNoivo = pessoaNoivo;
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
* EVENTO:
id
data
CERIMONIAL
IGREJA
CARTÓRIO
PESSOA NOIVA
PESSOA NOIVO
dataCriacao
dataModificacao

* */
