/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author jeshc
 */
public class ModeloCombo implements ComboBoxModel{
    ArrayList<String> data;
    String selected;

    public ModeloCombo() {
    }

    public ModeloCombo(ArrayList<String> data, String selected) {
        this.data = data;
        this.selected = selected;
    }
    
    
    
    @Override
    public void setSelectedItem(Object anItem) {
      selected = (String)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Object getElementAt(int index) {
      return data.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
     }

    @Override
    public void removeListDataListener(ListDataListener l) {
     }
    
}
