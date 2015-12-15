package br.com.designPatterns.cap2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais {
	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	private static List<Class<? extends Nota>> clazzes;

    static {
         clazzes = Arrays.asList(
                    Do.class, DoSustenido.class, Re.class, ReSustenido.class, 
                    Mi.class, MiSustenido.class, Fa.class, FaSustenido.class,
                    Sol.class, SolSustenido.class, La.class, LaSustenido.class, 
                    Si.class, SiSustenido.class);
    }

    public Nota get(String nome) {
        try {
            if(!notas.containsKey(nome)) {
            	StringBuilder stringNota = new StringBuilder();
            	if(nome.endsWith("#")){
            		stringNota.append(nome.substring(0, nome.length()-1) + "Sustenido");
            	}
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().equalsIgnoreCase(nome)) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }else if(clazz.getSimpleName().equalsIgnoreCase(stringNota.toString())){
                    	notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
