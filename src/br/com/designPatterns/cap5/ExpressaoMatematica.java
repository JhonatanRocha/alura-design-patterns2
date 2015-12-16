package br.com.designPatterns.cap5;

public interface ExpressaoMatematica {

	int avalia();
	void aceita(Visitor impressora);
}
