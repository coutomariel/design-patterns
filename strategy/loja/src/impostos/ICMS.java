package impostos;

import java.math.BigDecimal;

import loja.Orcamento;

public class ICMS implements Imposto{

	@Override
	public BigDecimal calculaImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.1));
	}

}
