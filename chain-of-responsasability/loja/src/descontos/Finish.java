package descontos;

import java.math.BigDecimal;

import loja.Orcamento;

public class Finish extends Desconto{

	public Finish() {
		super(null);
	}

	@Override
	BigDecimal calculaDesconto(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
