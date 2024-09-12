package entities;

import java.time.LocalDateTime;

public class Fornecedor {
    private static long serial;
    private long id;
    private String nomeFornecedor;
    private String cnpj;
    private String telefoneFornecedor;
    private double valorAPagar;
    private int parcelas;
    private boolean statusPagamento;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;


    public Fornecedor(){id = Fornecedor.serial++;}

    public long getId(){return id;}

    public String getNomeFornecedor(){return nomeFornecedor;}

    public void setNomeFornecedor(String nomeFornecedor){
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpj(){return cnpj;}

    public void  setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getTelefoneFornecedor(){return telefoneFornecedor;}

    public void setTelefoneFornecedor(String telefoneFornecedor){
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public double getValorAPagar(){return valorAPagar;}

    public void setValorAPagar(double valorAPagar){
        this.valorAPagar = valorAPagar;
    }

    public int getParcelas(){return parcelas;}

    public void setParcelas(int parcelas){
        this.parcelas = parcelas;
    }

    public boolean getStatusPagamento(){return  statusPagamento;}

    public void setStatusPagamento(boolean statusPagamento){
        this.statusPagamento = statusPagamento;
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
* FORNECEDOR:
id
nome
cnpj
telefone
valorAPagar
parcelas
estado do pagamento(V ou F)
dataCriacao
dataModificacao

* */