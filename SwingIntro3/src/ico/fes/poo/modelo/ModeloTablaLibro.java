/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author jeshc
 */
public class ModeloTablaLibro implements TableModel {

    private ArrayList<Libro> data;

    public ModeloTablaLibro() {
    }

    public ModeloTablaLibro(ArrayList<Libro> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnTitle = "";

        switch (columnIndex) {
            case 0:
                columnTitle = "Título";
                break;
            case 1:
                columnTitle = "Autor";
                break;
            case 2:
                columnTitle = "ISBN";
                break;
            case 3:
                columnTitle = "Editorial";
                break;
            case 4:
                columnTitle = "Edición";
                break;
            case 5:
                columnTitle = "Precio";
                break;

            default:
                columnTitle = "ND";
        }

        return columnTitle;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            case 5:
                return Float.class;

            default:
                return String.class;
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Libro tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getTitulo();
            case 1:
                return tmp.getAutor();
            case 2:
                return tmp.getIsbn();
            case 3:
                return tmp.getEditorial();
            case 4:
                return tmp.getEdicion();
            case 5:
                return tmp.getPrecio();

            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

}
