package descontos;

import java.math.BigDecimal;

import loja.Orcamento;

public class DescontoMaisCincoItens extends Desconto {

	public DescontoMaisCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	BigDecimal calculaDesconto(Orcamento orcamento) {
		if(orcamento.getQtdItems()>5) {
			return orcamento.getValor().multiply(new BigDecimal(0.1));
		}
		return proximo.calculaDesconto(orcamento);
	}
	

}
