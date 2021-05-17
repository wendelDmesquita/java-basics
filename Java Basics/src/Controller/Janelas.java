package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Janelas {
	private JFrame j;
	private JButton botao;
	private Integer alturaNativa, larguraNativa;
	private Integer eixoX, eixoY, altura, largura;

	public void getResolucao() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		String opcoes[] = { "1366x768", "1024x768", "1280x1024", "1600x900", "1920x1080" };
		Integer escolha = JOptionPane.showOptionDialog(null, "Escolha sua resolução", "Resolução da máquina",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

		switch (escolha) {
		case JOptionPane.CLOSED_OPTION:
			JOptionPane.showMessageDialog(null, "O Programa será encerrado!", "adios men", JOptionPane.ERROR_MESSAGE,
					null);
			System.exit(0);
			break;
		case 0:
			this.alturaNativa = 1366;
			this.larguraNativa = 768;
			break;
		case 1:
			this.alturaNativa = 1024;
			this.larguraNativa = 768;
			break;
		case 2:
			this.alturaNativa = 1280;
			this.larguraNativa = 1024;
			break;
		case 3:
			this.alturaNativa = 1600;
			this.larguraNativa = 900;
			break;
		case 4:
			this.alturaNativa = 1920;
			this.larguraNativa = 1080;
			break;
		}
		JOptionPane.showMessageDialog(null,
				"Na escolha da resolução incorreta, o sistema irá demonstrar incompatibilidades!\nLembre-se de sempre selecionar a resolução correta!",
				"Atenção", JOptionPane.WARNING_MESSAGE, null);
	}

	public void janelaPrincipal(String tituloJanela) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		j = new JFrame();
		setBound(100, 100, 800, 400);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLayout(null);
		j.setVisible(true);
		j.setResizable(false);

		botao = new JButton();
		botao.setBounds(350, 150, 100, 20);
		botao.setText("tela inteira!");
		botao.addActionListener(modificarTela());
		j.add(botao);

	}

	private ActionListener modificarTela() {
		ActionListener acao = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (eixoX == 100 && eixoY == 100 && altura == 800 && largura == 400) {
					setBound(0, 0, alturaNativa, larguraNativa);
					botao.setText("tela reduzida!");
				} else {
					setBound(100, 100, 800, 400);
					botao.setText("tela inteira!");
				}
			}
		};
		return acao;
	}

	private void setBound(int eixoX, int eixoY, int altura, int largura) {
		this.eixoX = eixoX;
		this.eixoY = eixoY;
		this.altura = altura;
		this.largura = largura;
		j.setBounds(this.eixoX, this.eixoY, this.altura, this.largura);
	}
}
