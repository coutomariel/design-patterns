package descontos;

import java.math.BigDecimal;

import loja.Orcamento;

public class CalculadoraDescontos {
	
	public BigDecimal calculaDesconto(Orcamento orcamento) {
		
		if(orcamento.getQtdItems()>5) {
			return orcamento.getValor().multiply(new BigDecimal(0.1));
		} else if(orcamento.getValor().compareTo(new BigDecimal(500.00)) > 0) {
			return orcamento.getValor().multiply(new BigDecimal(0.06));
		} else {
			return BigDecimal.ZERO;
		}
	}

}
