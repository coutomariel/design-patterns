package orcamento;

import orcamento.situacao.EmAnalise;
import orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer qtdItems;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, Integer qtdItems) {
        super();
        this.valor = valor;
        this.qtdItems = qtdItems;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQtdItems() {
        return qtdItems;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public void aplicarDescontoExtra() {
        BigDecimal descExtra = this.situacao.calculaDescontoExtra(this.valor);
        this.valor = this.valor.subtract(descExtra);
    }
}
