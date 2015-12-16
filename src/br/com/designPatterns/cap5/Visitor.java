package br.com.designPatterns.cap5;

public interface Visitor {

	public abstract void visitaNumero(Numero numero);

	public abstract void visitaSoma(Soma soma);

	public abstract void visitaSubtracao(Subtracao subtracao);

	public abstract void visitaDivisao(Divisao divisao);

	public abstract void visitaMultiplicacao(Multiplicacao multiplicacao);

	public abstract void visitaRaizQuadrada(RaizQuadrada raizQuadrada);

}