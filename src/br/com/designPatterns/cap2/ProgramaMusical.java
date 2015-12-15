package br.com.designPatterns.cap2;

import java.util.Arrays;
import java.util.List;

public class ProgramaMusical {
	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais(); 
		List<Nota> musica = Arrays.asList(notas.get("Do"), 
											notas.get("Re"), 
											notas.get("Mi"), 
											notas.get("Fa"), 
											notas.get("Fa"), 
											notas.get("Fa"),
											notas.get("Do"),    
								            notas.get("Re"),    
								            notas.get("Do"),    
								            notas.get("Re"),    
								            notas.get("Re"),    
								            notas.get("Re"),					          
								            notas.get("Do"), 
											notas.get("Sol"), 
											notas.get("Fa"), 
											notas.get("Mi"), 
											notas.get("Mi"), 
											notas.get("Mi"),
											notas.get("Do#"),    
											notas.get("Re#"), 
											notas.get("Mi#"), 
											notas.get("Fa#"), 
											notas.get("Fa#"), 
											notas.get("Fa#"));
		
		Piano piano = new Piano();
		piano.toca(musica);
	}
}
