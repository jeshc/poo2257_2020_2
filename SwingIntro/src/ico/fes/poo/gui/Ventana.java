/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jeshc
 */
public class Ventana extends JFrame{
    private JTextField textField1;
    private JButton boton1;
    private JTextArea textArea1;

    public Ventana() throws HeadlessException {
        super("Mi ventana Swing");
        super.setSize(400, 600);
        this.getContentPane().setLayout(new FlowLayout());
        textField1 = new JTextField(10);
        boton1=new JButton("Aceptar");
        textArea1=new  JTextArea( 3, 10);
        textArea1.setBackground(Color.red);
        this.getContentPane().add(textField1);
        this.getContentPane().add(boton1);
        this.getContentPane().add(textArea1);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cerrando");
                System.exit(0);
            }
            
        });
        
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea1.setText(textField1.getText());
            }

        
        });
        
        
    }
    
    
    
}
