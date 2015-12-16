package br.com.designPatterns.cap6;

import java.util.Calendar;


public class Programa {
	public static void main(String[] args) throws Exception {
		
		/*
		 * Bridge (Ponte)
		 *
		 * é a ponte que vai interligar
		 * o seu sistema com algum sistema
		 * externo.
		 */
		Mapa mapa = new GoogleMaps();
		mapa.getMapa("rua vergueiro");
		
		/*
		 * Adapter
		 *
		 * Adapta interfaces antigas a interfaces novas
		 * para esconder coisas de um sistema legado
		 * e adaptala ao novo código/sistema.
		 */
		Relogio relogio = new RelogioSistema();
		Calendar dataAtual = relogio.hoje();
	}
}
