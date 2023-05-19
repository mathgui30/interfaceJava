import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inter {
	public static void main (String [] args) {
		JFrame frame = new JFrame ("Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		
		JButton button = new JButton("Consultar catálogo");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirNovaPagina();
			}
		});
		JPanel panel = new JPanel();
		panel.add(button);
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
	public static void abrirNovaPagina() {
		JFrame novaPagina = new JFrame("Consulta");
		novaPagina.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		novaPagina.setSize(400,300);
		
		JLabel label = new JLabel("Catálogo: ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		novaPagina.getContentPane().add(label);
		novaPagina.setVisible(true);
	}
}