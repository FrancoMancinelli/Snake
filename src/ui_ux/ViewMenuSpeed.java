package ui_ux;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class ViewMenuSpeed extends JPanel{

	private JFrame frameMenuSpeed;
	private JLabel lblFondo;
	private JLabel lblTitulo;
	private JButton btnFacil;
	private JButton btnIntermedio;
	private JButton btnDificil;
	private JButton btnImposible;
	private JLabel lblMenuInicial;
	private JLabel lblEligeModo;
	private ViewMenuSize frameMenuSize;

	
	/**
	 * Create the application.
	 */
	public ViewMenuSpeed() {
		initialize();
		frameMenuSpeed.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMenuSpeed = new JFrame();
		setUI();
		setListeners();
	}
	
	public void setUI() {
		frameMenuSpeed = new JFrame();
		frameMenuSpeed.setBounds(100, 100, 600, 500);
		frameMenuSpeed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenuSpeed.getContentPane().setLayout(null);
			
		lblTitulo = new JLabel("Snake");
		lblTitulo.setForeground(new Color(255, 255, 0));
		lblTitulo.setFont(new Font("MV Boli", Font.BOLD, 90));
		lblTitulo.setBounds(160, 53, 250, 90);
		frameMenuSpeed.getContentPane().add(lblTitulo);
		
		btnFacil = new JButton("Facil");

		btnFacil.setBackground(new Color(218, 165, 32));
		btnFacil.setBounds(200, 214, 167, 42);
		frameMenuSpeed.getContentPane().add(btnFacil);
		
		btnIntermedio = new JButton("Intermedio");
		
		btnIntermedio.setBackground(new Color(218, 165, 32));
		btnFacil.setBackground(new Color(218, 165, 32));
		btnIntermedio.setBounds(200, 274, 167, 42);
		frameMenuSpeed.getContentPane().add(btnIntermedio);
		
		btnDificil = new JButton("Dificil");
		
		btnDificil.setBackground(new Color(218, 165, 32));
		btnFacil.setBackground(new Color(218, 165, 32));
		btnDificil.setBounds(200, 334, 167, 42);
		frameMenuSpeed.getContentPane().add(btnDificil);
			
		btnImposible = new JButton("Imposible");
		
		btnImposible.setBackground(new Color(218, 165, 32));
		btnFacil.setBackground(new Color(218, 165, 32));
		btnImposible.setBounds(200, 394, 167, 42);
		frameMenuSpeed.getContentPane().add(btnImposible);
		
		lblMenuInicial = new JLabel("MEN\u00DA INICIAL");
		lblMenuInicial.setFont(new Font("Tahoma", Font.BOLD, 16));	
		lblMenuInicial.setForeground(new Color(255, 255, 255));
		lblMenuInicial.setBounds(229, 150, 126, 14);
		frameMenuSpeed.getContentPane().add(lblMenuInicial);
			
		lblEligeModo = new JLabel("A CONTINUACI\u00D3N ELIGE UN MODO DE JUEGO...");
		lblEligeModo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEligeModo.setForeground(new Color(255, 255, 255));
		lblEligeModo.setBounds(156, 175, 292, 14);
		frameMenuSpeed.getContentPane().add(lblEligeModo);
		
		lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 584, 461);
		frameMenuSpeed.getContentPane().add(lblFondo);
		lblFondo.setIcon(new ImageIcon(ViewMenuSpeed.class.getResource("/utils/grass_template2.jpg")));
	}
	
	public void setListeners() {
		btnImposible.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenuSpeed.setVisible(false);
				var juego = new ViewJuego();
				new ViewMenuSize(0, juego);
			}
		});
		
		btnDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenuSpeed.setVisible(false);
				var juego = new ViewJuego();
				new ViewMenuSize(3, juego);
			}
		});
		
		btnIntermedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenuSpeed.setVisible(false);
				var juego = new ViewJuego();
				new ViewMenuSize(7, juego);
			}
		});
		
		btnFacil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenuSpeed.setVisible(false);
				var juego = new ViewJuego();
				new ViewMenuSize(10, juego);
			}
		});
		
	}
	
	
}

