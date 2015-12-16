package br.com.designPatterns.cap8;

public class EmpresaFacadeSingleton {
	private static EmpresaFacade empresaFacadeInstance;
	
	public EmpresaFacade getInstance() {
		if(empresaFacadeInstance == null){
			empresaFacadeInstance = new EmpresaFacade();
		}
		
		return empresaFacadeInstance;
	}
}
