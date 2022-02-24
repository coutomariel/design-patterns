package descontos;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class DescontoValorMaiorQuinhentos extends Desconto{

	public DescontoValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal efetuaCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.05));
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal(500))>0;
	}

}
