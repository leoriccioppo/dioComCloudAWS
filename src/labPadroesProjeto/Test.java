package labPadroesProjeto;

import labPadroesProjeto.gof.facade.Facade;
import labPadroesProjeto.gof.singleton.SingletonEager;
import labPadroesProjeto.gof.singleton.SingletonLazy;
import labPadroesProjeto.gof.singleton.SingletonLazyHolder;
import labPadroesProjeto.gof.strategy.ComportamentoAgressivo;
import labPadroesProjeto.gof.strategy.ComportamentoDefensivo;
import labPadroesProjeto.gof.strategy.ComportamentoNormal;
import labPadroesProjeto.gof.strategy.Robo;

public class Test {
	
	public static void main(String[] args) {
		//Testes relacionados ao Design Pattern
		//Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(agressivo);		
		robo.mover();
		robo.mover();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Leonora", "22440-901");
		
		
	}

}
