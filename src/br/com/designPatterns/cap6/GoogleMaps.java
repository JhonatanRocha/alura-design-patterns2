package br.com.designPatterns.cap6;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String getMapa(String endereco) {
		try {
			URL url = new URL(endereco);
			InputStream openStream = url.openStream();
			
			return "mapa";
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
}
