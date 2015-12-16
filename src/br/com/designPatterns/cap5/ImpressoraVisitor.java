package br.com.designPatterns.cap5;

public class ImpressoraVisitor implements Visitor {
	
	@Override
	public void visitaNumero(Numero numero){
		System.out.print(numero.getNumero());
	}
	
	@Override
	public void visitaSoma(Soma soma){
		System.out.print("(");
		
		//express�o esquerda
		soma.getEsquerda().aceita(this);
		
		System.out.print(" + ");
		
		//express�o direita
		soma.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	@Override
	public void visitaSubtracao(Subtracao subtracao){
		System.out.print("(");
		
		//express�o esquerda
		subtracao.getEsquerda().aceita(this);
		
		System.out.print(" - ");
		
		//express�o direita
		subtracao.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	@Override
	public void visitaDivisao(Divisao divisao){
		System.out.print("(");
		
		//express�o esquerda
		divisao.getEsquerda().aceita(this);
		
		System.out.print(" / ");
		
		//express�o direita
		divisao.getDireita().aceita(this);
		
		System.out.print(")");
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao){
		System.out.print("(");
		
		//express�o esquerda
		multiplicacao.getEsquerda().aceita(this);
		
		System.out.print(" * ");
		
		//express�o direita
		multiplicacao.getDireita().aceita(this);
		
		System.out.print(")");
	}

	@Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
		System.out.println(raizQuadrada.getRaizQuadrada());		
	}
}
