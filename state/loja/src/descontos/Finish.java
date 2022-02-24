package descontos;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class Finish extends Desconto{

	public Finish() {
		super(null);
	}

	@Override
	protected BigDecimal efetuaCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
