package br.edu.ifpe.apoo.negocio;

public class FacadeFactory {
	
	public static PersistenciaFacade getInstanciaPersistenciaFacade() {
		return new PersistenciaFacade();
	}

}
