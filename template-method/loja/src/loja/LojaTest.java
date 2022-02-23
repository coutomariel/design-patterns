package loja;

import java.math.BigDecimal;
import java.math.RoundingMode;

import descontos.CalculadoraDescontos;

public class LojaTest {
	
	public static void main(String[] args) {
		
		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		
		Orcamento orcamento = new Orcamento(new BigDecimal(100.00), 6);
		BigDecimal desc = calculadora.calculaDesconto(orcamento);
		System.out.println("Desconto mais que 5 items -> " + desc.setScale(2, RoundingMode.DOWN));

		Orcamento orcamento2 = new Orcamento(new BigDecimal(600.00), 2);
		BigDecimal desc2 = calculadora.calculaDesconto(orcamento2);
		System.out.println("Desconto valor maior que R$500 -> " + desc2.setScale(2, RoundingMode.DOWN));

	
	}


}
