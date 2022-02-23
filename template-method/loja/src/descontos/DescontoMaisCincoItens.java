package descontos;

import java.math.BigDecimal;

import loja.Orcamento;

public class DescontoMaisCincoItens extends Desconto {

	public DescontoMaisCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQtdItems()>5;
	}

	@Override
	protected BigDecimal efetuaCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.1));
	}
	

}
