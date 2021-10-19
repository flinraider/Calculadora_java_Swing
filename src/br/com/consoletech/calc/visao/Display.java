package br.com.consoletech.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.consoletech.calc.modelo.Memoria;
import br.com.consoletech.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display  extends JPanel implements MemoriaObservador {
	
	
	private final JLabel label;

	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(Color.DARK_GRAY);
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setFont(new Font("courier", Font.PLAIN, 30));
		label.setForeground(Color.white);
	    setLayout(new FlowLayout(FlowLayout.RIGHT, 10,25));
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		
		label.setText(novoValor);
		
	}
}
