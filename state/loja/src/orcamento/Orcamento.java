package orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer qtdItems;
    private String situacao;

    public Orcamento(BigDecimal valor, Integer qtdItems) {
        super();
        this.valor = valor;
        this.qtdItems = qtdItems;
        this.situacao = "EM_ANALISE";
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQtdItems() {
        return qtdItems;
    }

    public String getSituacao() {
        return situacao;
    }

    public void aplicarDescontoExtra() {
        BigDecimal descExtra = BigDecimal.ZERO;
		if (this.situacao.equals("EM_ANALISE")) {
			descExtra = new BigDecimal("0.05");
        } else if(this.situacao.equals("APROVADO")){
			descExtra = new BigDecimal("0.02");
		}
        this.valor = this.valor.subtract(this.valor.multiply(descExtra));
    }
}
