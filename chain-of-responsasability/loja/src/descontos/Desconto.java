package descontos;

import java.math.BigDecimal;

import loja.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	abstract BigDecimal calculaDesconto(Orcamento orcamento);

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

}
