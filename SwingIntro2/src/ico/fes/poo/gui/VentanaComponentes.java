/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.eventos.EventosItems;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author jeshc
 */
public class VentanaComponentes extends JFrame {

    private JButton boton1;
    private JTextField entrada;
    private JButton botonArchivo;
    private JComboBox combo;
    private JLabel etiqueta;
    private JTextArea area;
    
    public VentanaComponentes() throws HeadlessException {
        super("Elementos swing");
        super.setSize(400, 300);
        super.getContentPane().setLayout(new FlowLayout());
        boton1 = new JButton("Saludame");
        entrada = new JTextField(10);
        botonArchivo= new JButton("Elegir archivo");
        String [] frutas={"Limon","piña","Kiwi","Naranja"};
        combo=new JComboBox(frutas);
        etiqueta=new JLabel("Hola mundo");
        etiqueta.setForeground(new Color(122, 250, 122) );
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.red);
        area=new JTextArea(3,10);
        super.getContentPane().add(entrada);
        super.getContentPane().add(boton1);
        super.getContentPane().add(botonArchivo);
        super.getContentPane().add(combo);
        super.getContentPane().add(etiqueta);
        super.getContentPane().add(area);
        
        combo.addActionListener(new EventosItems());
//        combo.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println("Clic sobre el combo");
//            }
//            
//        });
        
        
        botonArchivo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser jfc=new JFileChooser();
                jfc.showOpenDialog(null);
                File archivo = jfc.getSelectedFile();
                System.out.println("Ruta:"+archivo.getAbsolutePath());
            }
            
        });
        
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int resp=JOptionPane.showConfirmDialog(
                        null,
                        "¿Quieres continuar?",
                        "Responde:",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                        );
                if(resp == JOptionPane.YES_OPTION)
                    System.out.println("Respondiste SI");
                if(resp == JOptionPane.NO_OPTION)
                    System.out.println("Respondiste NO");
                if(resp == JOptionPane.CANCEL_OPTION)
                    System.out.println("Respondiste CANCEL");
                // INput dialog
                String entrada = JOptionPane.showInputDialog(
                        null,
                        "Introduce tu nombre:", 
                        "Dame tu nombre",
                        JOptionPane.QUESTION_MESSAGE);
                        JOptionPane.showMessageDialog(null, entrada.toUpperCase());
                        System.out.println(""+System.getProperty("user.dir"));
                        ImageIcon i = new ImageIcon(System.getProperty("user.dir")+"/src/hulk.png");
                        etiqueta.setText("");
                        etiqueta.setIcon(i);
                        boton1.setIcon(i);
                        
            }           
        });
        
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
    }
    
}
