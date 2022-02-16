package loja;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private Integer qtdItems;
	
	public Orcamento(BigDecimal valor, Integer qtdItems) {
		super();
		this.valor = valor;
		this.qtdItems = qtdItems;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Integer getQtdItems() {
		return qtdItems;
	}
	
	
}
