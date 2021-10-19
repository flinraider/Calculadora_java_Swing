package br.com.consoletech.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	
 public Botao(String texto, Color cor) {
	setText(texto);
	setForeground(Color.white);
	setOpaque(true);
    setBackground(cor);	
    setFont(new Font("courier", Font.PLAIN, 22));  
    setBorder(BorderFactory.createLineBorder(Color.BLACK));
 }	
}
