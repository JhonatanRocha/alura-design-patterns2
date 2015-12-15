package br.com.designPatterns.cap4;

public class Programa {
	public static void main(String[] args) {
				
		//ExpressaoMatematica esquerda = new Subtracao(new Numero(10), new Numero(5));
		ExpressaoMatematica esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		ExpressaoMatematica direita = new Soma(new Numero(2), new Numero(10));
		
		ExpressaoMatematica soma = new Soma(esquerda, direita);
		ExpressaoMatematica divisao = new Divisao(soma, new Numero(2));
		
		//int resultadoExpressao = soma.avalia();
		int resultadoExpressao = divisao.avalia();
		
		System.out.println("Resultado da expressão: " + resultadoExpressao);
		
		/*
		 * Implemente uma expressão que calcula a raíz quadrada do número. 
		 * Para calcular, basta usar o método Math.sqrt().
		 * Uma raiz quadrada calcula o valor em cima de uma expressão.
		 */
		int raiz = 9;
		ExpressaoMatematica raizQuadrada = new RaizQuadrada(new Numero(raiz));
		int resultadoExercicio = raizQuadrada.avalia();
		
		System.out.println("O Resultado da Raiz Quadrada de " + raiz + " é: " + resultadoExercicio);
	}
}
