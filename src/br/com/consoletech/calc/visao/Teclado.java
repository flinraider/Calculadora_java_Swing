package br.com.consoletech.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.consoletech.calc.modelo.Memoria;
import br.com.consoletech.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

	private final Color CINZA_ESCURO = new Color(68, 68, 68);
	private final Color CINZA_CLARO = new Color(99, 99, 99);
	private final Color LARANJA = new Color(242, 163, 60);

	public Teclado() {

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);
		
		c.weightx = 1; // ira ocupar a horizontal inteira
		c.weighty = 1; // ira ocupar a vertical inteira
		c.fill = GridBagConstraints.BOTH; // ajustar botoes

		// linha 1
		c.gridwidth = 2; // faço ocupar 3
		adicionarbotao("AC", CINZA_ESCURO, c, 0, 0);
	//	adicionarbotao("+/-", CINZA_ESCURO, c, 1, 0);
		c.gridwidth = 1; // depois retorno ao padrao.
		adicionarbotao("±", CINZA_ESCURO, c, 2, 0);
		adicionarbotao("/", LARANJA, c, 3, 0);

		// linha 2
		adicionarbotao("7", CINZA_CLARO, c, 0, 1);
		adicionarbotao("8", CINZA_CLARO, c, 1, 1);
		adicionarbotao("9", CINZA_CLARO, c, 2, 1);
		adicionarbotao("*", LARANJA, c, 3, 1);

		// linha 3
		adicionarbotao("4", CINZA_CLARO, c, 0, 2);
		adicionarbotao("5", CINZA_CLARO, c, 1, 2);
		adicionarbotao("6", CINZA_CLARO, c, 2, 2);
		adicionarbotao("-", LARANJA, c, 3, 2);

		// linha 4
		adicionarbotao("1", CINZA_CLARO, c, 0, 3);
		adicionarbotao("2", CINZA_CLARO, c, 1, 3);
		adicionarbotao("3", CINZA_CLARO, c, 2, 3);
		adicionarbotao("+", LARANJA, c, 3, 3);

		// linha 5
		c.gridwidth = 2;
		adicionarbotao("0", CINZA_CLARO, c, 0, 4);
	//	adicionarbotao("0", CINZA_CLARO, c, 1, 4);
		c.gridwidth = 1;
		adicionarbotao(",", CINZA_CLARO, c, 2, 4);
		adicionarbotao("=", LARANJA, c, 3, 4);

	}

	private void adicionarbotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
		
	}

}
