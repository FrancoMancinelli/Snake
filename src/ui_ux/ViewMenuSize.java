package ui_ux;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ViewMenuSize extends JPanel{

	private JFrame frameMenuSize;
	private JLabel lblFondo;
	private JLabel lblTitulo;
	private JButton btnSmall;
	private JButton btnMid;
	private JButton btnBig;
	private JLabel lblMenuInicial;
	private JLabel lblEligeSize;
	private int velocidad;
	private ViewJuego juego;

	
	/**
	 * Create the application.
	 */
	public ViewMenuSize(int v, ViewJuego j) {
		velocidad = v;
		juego = j;
		initialize();
		frameMenuSize.setVisible(true);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMenuSize = new JFrame();
		setUI();
		setListeners();
	}
	
	public void setUI() {
		frameMenuSize = new JFrame();
		frameMenuSize.setBounds(100, 100, 600, 500);
		frameMenuSize.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenuSize.getContentPane().setLayout(null);
			
		lblTitulo = new JLabel("Snake");
		lblTitulo.setForeground(new Color(255, 255, 0));
		lblTitulo.setFont(new Font("MV Boli", Font.BOLD, 90));
		lblTitulo.setBounds(160, 53, 250, 90);
		frameMenuSize.getContentPane().add(lblTitulo);
		
		btnSmall = new JButton("Peque\u00F1o");

		btnSmall.setBackground(new Color(218, 165, 32));
		btnSmall.setBounds(200, 214, 167, 42);
		frameMenuSize.getContentPane().add(btnSmall);
		
		btnMid = new JButton("Mediano");
		
		btnMid.setBackground(new Color(218, 165, 32));
		btnSmall.setBackground(new Color(218, 165, 32));
		btnMid.setBounds(200, 274, 167, 42);
		frameMenuSize.getContentPane().add(btnMid);
		
		btnBig = new JButton("Grande");
		
		btnBig.setBackground(new Color(218, 165, 32));
		btnSmall.setBackground(new Color(218, 165, 32));
		btnBig.setBounds(200, 334, 167, 42);
		frameMenuSize.getContentPane().add(btnBig);
		btnSmall.setBackground(new Color(218, 165, 32));
		
		lblMenuInicial = new JLabel("MEN\u00DA INICIAL");
		lblMenuInicial.setFont(new Font("Tahoma", Font.BOLD, 16));	
		lblMenuInicial.setForeground(new Color(255, 255, 255));
		lblMenuInicial.setBounds(229, 150, 126, 14);
		frameMenuSize.getContentPane().add(lblMenuInicial);
			
		lblEligeSize = new JLabel("A CONTINUACI\u00D3N ELIGE EL TAMA\u00D1O DEL JUEGO...");
		lblEligeSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEligeSize.setForeground(new Color(255, 255, 255));
		lblEligeSize.setBounds(138, 175, 310, 14);
		frameMenuSize.getContentPane().add(lblEligeSize);
		
		lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 584, 461);
		frameMenuSize.getContentPane().add(lblFondo);
		lblFondo.setIcon(new ImageIcon(ViewMenuSpeed.class.getResource("/utils/grass_template2.jpg")));
	}
	
	public void setListeners() {
		
		btnBig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenuSize.setVisible(false);
				try {
					juego.setVelocidad(velocidad);
					juego.setMySize(3);
					juego.start();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		
		btnMid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenuSize.setVisible(false);
				try {
					juego.setVelocidad(velocidad);
					juego.setMySize(2);
					juego.start();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		
		btnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenuSize.setVisible(false);
				try {
					juego.setVelocidad(velocidad);
					juego.setMySize(1);
					juego.start();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		
	}
	
	
}
