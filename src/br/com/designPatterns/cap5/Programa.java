package br.com.designPatterns.cap5;

public class Programa {
	public static void main(String[] args) {
				
		ExpressaoMatematica esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		ExpressaoMatematica direita = new Soma(new Numero(2), new Numero(10));
		
		ExpressaoMatematica soma = new Soma(esquerda, direita);
		
		int resultadoExpressao = soma.avalia();
	
		Visitor impressora = new ImpressoraVisitor();
		soma.aceita(impressora);
		System.out.print(" = " + resultadoExpressao);
		
		
	}
}
