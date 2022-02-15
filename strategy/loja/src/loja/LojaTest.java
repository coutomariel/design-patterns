package loja;

import java.math.BigDecimal;
import java.math.RoundingMode;

import impostos.CalculadoraImpostos;
import impostos.Imposto;

public class LojaTest {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal(100.00));
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		BigDecimal impostoDevido = calculadora.calculaImposto(orcamento, Imposto.ISS);
		 
		System.out.printf("imposto -> " + impostoDevido.setScale(2, RoundingMode.DOWN));
	}

	
}
