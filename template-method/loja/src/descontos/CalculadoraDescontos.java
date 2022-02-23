package descontos;

import java.math.BigDecimal;

import loja.Orcamento;

public class CalculadoraDescontos {
	
	public BigDecimal calculaDesconto(Orcamento orcamento) {
		
		Desconto desconto =  
				new DescontoMaisCincoItens(
						new DescontoValorMaiorQuinhentos(
								new Finish()));
		
		return desconto.calculaDesconto(orcamento);
	}

}
