package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class AnaSayfa extends JFrame {

	public AnaSayfa() {
		
		initPencere();
		
	}

	private void initPencere() {
		
		JPanel anaPanel = initPanel();
		
		add(anaPanel);
		setTitle("Ortalama Vade");
		setSize(400,500);
		setVisible(true);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

	private JPanel initPanel() {
		
		JPanel anaPanel = new JPanel(new BorderLayout());
		
		
		// ust panel //
		
		JPanel ustPanel = new JPanel();
		anaPanel.add(ustPanel,BorderLayout.NORTH);
		
		JLabel vadeLabel = new JLabel("Vade :",JLabel.RIGHT);
		ustPanel.add(vadeLabel);
		JTextField vadeField = new JTextField(10);
		ustPanel.add(vadeField);
		
		JLabel tutarLabel = new JLabel("Tutar :",JLabel.RIGHT);
		ustPanel.add(tutarLabel);
		JTextField tutarField = new JTextField(10);
		ustPanel.add(tutarField);
		
		JButton ekleButton = new JButton("Ekle");
		ustPanel.add(ekleButton);
		
		
		// orta panel //
		
		JList list = new JList();
		JScrollPane pane = new JScrollPane(list);
		anaPanel.add(pane);
		
		
		// alt panel //
		
		JPanel altPanel = new JPanel(new GridLayout(1, 1));
		anaPanel.add(altPanel,BorderLayout.SOUTH);
		
		JButton silButton = new JButton("Sil");
		altPanel.add(silButton);
		silButton.setFont(new Font("Ariel", Font.BOLD, 20));
		
		
		
		
		return anaPanel;
	}

}
