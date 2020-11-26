package swing_package;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class tela {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Minha tela");//título da janela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//
		janela.setSize(600, 200);//tamanho da janela pixel
		janela.setLayout(new FlowLayout());// utiliza um layout para a janela neste caso o FlowLayout
		janela.setLocationRelativeTo(null);//centraliza a tela relativa a janela anterior, se usar null centraliza com base na tela do pc
		
		
		
		JButton botao = new JButton("Clicar!");//instanciando objeto botão do tipo JButton
		janela.add(botao);//adiciona o botão à janela
		
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Evento ocorreu!");
			}
		});
		
		//abaixo o mesmo resultado das linhas 26 a 33 porém usando lambda
		
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu por lambda!!!");
		});
		
		janela.setVisible(true);//habilitar a janela
		

	}

}
