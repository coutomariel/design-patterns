package impostos;

import java.math.BigDecimal;

import loja.Orcamento;

public class CalculadoraImpostos {

	public BigDecimal calculaImposto(Orcamento orcamento, Imposto imposto) {
		return imposto.calculaImposto(orcamento);
	}
}
