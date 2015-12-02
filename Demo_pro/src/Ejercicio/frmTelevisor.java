package Ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class frmTelevisor extends JFrame {

	private JPanel contentPane;
	private JTextField txtVolumen;
	private JTextField txtCanal;
	
	Televisor tv1=new Televisor();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTelevisor frame = new frmTelevisor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmTelevisor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEncender = new JButton("encender");
		btnEncender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.encender();
				System.out.println("televisor encendido");
			}
		});
		btnEncender.setBounds(350, 31, 123, 25);
		contentPane.add(btnEncender);
		
		JButton btnApagar = new JButton("apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.apagar();
				System.out.println("televisor apagado");
			}
		});
		btnApagar.setBounds(350, 69, 123, 25);
		contentPane.add(btnApagar);
		
		JButton btnCanal = new JButton("canal ++");
		btnCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.cambiarCanalArriba();
				txtCanal.setText("canal:"+tv1.obtenercanal()+"");
			}
		});
		btnCanal.setBounds(270, 155, 150, 38);
		contentPane.add(btnCanal);
		
		JButton btnCanal_1 = new JButton("canal--");
		btnCanal_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.cambiarCanalAbajo();
				txtCanal.setText("canal:"+tv1.obtenercanal()+"");
			}
		});
		btnCanal_1.setBounds(270, 206, 150, 32);
		contentPane.add(btnCanal_1);
		
		JButton btnSubirVol = new JButton("subir vol.");
		btnSubirVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.subirvolumen();
				txtVolumen.setText(tv1.obtenervolumen()+"");
			}
		});
		btnSubirVol.setBounds(28, 177, 117, 25);
		contentPane.add(btnSubirVol);
		
		JButton btnBajarVol = new JButton("bajar vol.");
		btnBajarVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv1.bajarVolumen();
				txtVolumen.setText(tv1.obtenervolumen()+"");
			}
		});
		btnBajarVol.setBounds(28, 215, 117, 25);
		contentPane.add(btnBajarVol);
		
		txtVolumen = new JTextField();
		txtVolumen.setBounds(141, 32, 116, 22);
		contentPane.add(txtVolumen);
		txtVolumen.setColumns(10);
		
		txtCanal = new JTextField();
		txtCanal.setColumns(10);
		txtCanal.setBounds(141, 70, 116, 22);
		contentPane.add(txtCanal);
	}
}
