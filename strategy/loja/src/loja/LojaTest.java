package loja;

import java.math.BigDecimal;
import java.math.RoundingMode;

import impostos.CalculadoraImpostos;
import impostos.ICMS;
import impostos.ISS;

public class LojaTest {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal(100.00));
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		BigDecimal icms = calculadora.calculaImposto(orcamento, new ICMS());
		BigDecimal iss = calculadora.calculaImposto(orcamento, new ISS());
		 
		System.out.printf("ICMS devido -> " + icms.setScale(2, RoundingMode.DOWN));
		System.out.printf("ISS devido -> " + iss.setScale(2, RoundingMode.DOWN));
	}

	
}
