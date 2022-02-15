package impostos;

import java.math.BigDecimal;

import loja.Orcamento;

public class CalculadoraImpostos {


	public BigDecimal calculaImposto(Orcamento orcamento, Imposto imposto) {
		switch (imposto) {
		case ICMS:
			return orcamento.getValor().multiply(new BigDecimal(0.1));
		case ISS:
			return orcamento.getValor().multiply(new BigDecimal(0.06));
		default:
			return BigDecimal.ZERO;
		}
		
	}
}
