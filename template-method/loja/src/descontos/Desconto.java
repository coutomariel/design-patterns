package descontos;

import java.math.BigDecimal;

import loja.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	protected abstract BigDecimal efetuaCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
	
	public BigDecimal calculaDesconto(Orcamento orcamento) {;
		if(deveAplicar(orcamento)) {
			efetuaCalculo(orcamento);
		}
		return proximo.efetuaCalculo(orcamento);
	}

}
