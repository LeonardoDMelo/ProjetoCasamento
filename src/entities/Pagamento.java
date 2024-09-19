package entities;

import java.time.LocalDateTime;

public class Pagamento {
    private static long serial;
    private long id;
    public LocalDateTime dataPagamento;
    public Pessoa pessoa;
    public String descricao;
    public Fornecedor fornecedor;
    public double valoAPagar;
    public double parcela;
    public LocalDateTime dataCriacao;
    public LocalDateTime dataModificacao;


    public Pagamento(){id = Pagamento.serial++;}

    public long getId(){return id;}

    public Pessoa getPessoa(){return pessoa;}

    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public String getDescricao(){return descricao;}
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Fornecedor getFornecedor(){return fornecedor;}
    public void setFornecedor(Fornecedor fornecedor){this.fornecedor = fornecedor;}

    public double getValoAPagar() {
        return valoAPagar;
    }
    public void setValoAPagar(double valoAPagar) {
        this.valoAPagar = valoAPagar;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getParcela() {
        return parcela;
    }

    public void setParcela(double parcela) {
        this.parcela = parcela;
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
* PAGAMENTO:
id
data
PESSOA
descricao
FORNECEDOR
valor
parcela
dataCriacao
dataModificacao

O pagamento pode ser o de um serviço qualquer ou de um fornecedor.
* O pagamento pode ser um pagamento regular à vista ou pode ser um pagamento agendado.
* Ao pagar todo o valor pretendido o estado do FORNECEDOR é modificado.
Para o pagamento agendado funcionar o software deve ter uma funcionalidade de calendário.
* Todo os dias o software verifica se tem algum pagamento agendado para o dia.
*  Se houver, o estado do pagamento é modificado. Se terminar de pagar
* todas as parcelas o estado do FORNECEDOR é modificado
Crie uma opção no menu do administrador de calendário.
* Este calendário tem uma data inicial e pode se modificado manualmente pelos administradores.

* */
