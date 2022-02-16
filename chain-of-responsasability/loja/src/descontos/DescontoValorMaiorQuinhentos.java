package descontos;

import java.math.BigDecimal;

import loja.Orcamento;

public class DescontoValorMaiorQuinhentos extends Desconto{

	public DescontoValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	BigDecimal calculaDesconto(Orcamento orcamento) {
		if(orcamento.getValor().compareTo(new BigDecimal(500))>0) {
			return orcamento.getValor().multiply(new BigDecimal(0.05));
		}
		return proximo.calculaDesconto(orcamento);
	}

}
