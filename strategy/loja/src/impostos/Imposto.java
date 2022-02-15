package impostos;

import java.math.BigDecimal;

import loja.Orcamento;

public interface Imposto {
	
	BigDecimal calculaImposto(Orcamento orcamento);

}
