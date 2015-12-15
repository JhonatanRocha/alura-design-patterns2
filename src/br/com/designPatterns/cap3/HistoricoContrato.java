package br.com.designPatterns.cap3;

import java.util.ArrayList;
import java.util.List;

public class HistoricoContrato {
	private List<EstadoContrato> estadosContratoSalvos = new ArrayList<>();

	public void adiciona(EstadoContrato estadoContrato){
		estadosContratoSalvos.add(estadoContrato);
	}

	public EstadoContrato getEstadoContrato(int index){
		return estadosContratoSalvos.get(index);
	}
	
}
