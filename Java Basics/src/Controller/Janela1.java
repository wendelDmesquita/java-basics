package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Janela1 extends JFrame{
	public Janela1() {
		this.setBounds(0,0,400,200);
		this.setVisible(true);
		JButton botao = new JButton("teste");
		botao.setBounds(10, 10, 400, 100);
		ActionListener acao = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame janelaTeste = new JFrame("Teste");
				janelaTeste.setBounds(0,0,400,200);
				janelaTeste.setVisible(true);
				
			}
		};
		botao.addActionListener(acao);
		this.add(botao);
	}
}
	