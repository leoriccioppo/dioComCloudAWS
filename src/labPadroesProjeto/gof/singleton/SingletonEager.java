package labPadroesProjeto.gof.singleton;

/**
 * Singleton "apressado"
 * @author leoriccioppo
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}
}
