/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author jeshc
 */
public class Ventana extends Frame{
    private Button boton1;
    private TextField textField1;
    private TextArea textArea1;

    public Ventana() throws HeadlessException {
        super("Hola de nuevo GUI AWT!!");
        super.setSize(400, 600);
        super.setLayout(new FlowLayout());
        boton1=new Button("Aceptar");
        textField1 = new TextField(10);
        textArea1 = new TextArea(3, 15);
        this.add(textField1);
        this.add(boton1);
        this.add(textArea1);
        
        boton1.addMouseListener( new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                String entrada = textField1.getText();
                textArea1.setText(entrada);
            }
            
         
            
        });
        
    }
    
    
}
