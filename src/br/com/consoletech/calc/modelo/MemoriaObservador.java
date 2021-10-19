package br.com.consoletech.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	// por padrao metodos em interface são publicos

	void valorAlterado(String novoValor);
	
}
