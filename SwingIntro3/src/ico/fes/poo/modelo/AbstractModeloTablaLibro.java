/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jeshc
 */
public class AbstractModeloTablaLibro extends AbstractTableModel{
    
    private ArrayList<Libro> data;

    public AbstractModeloTablaLibro() {
    }

    public AbstractModeloTablaLibro(ArrayList<Libro> data) {
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
        return true;
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
        Libro tmp=data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                tmp.setTitulo((String)aValue);
                break;
            case 1:
                tmp.setAutor((String)aValue);
                break;
            case 2:
                tmp.setIsbn((String)aValue);
                break;                
            case 3:
                tmp.setEditorial((String)aValue);
                break;
            case 4:
                 tmp.setEdicion(((Integer)aValue).intValue());
                 break;
            case 5:
                 tmp.setPrecio((float)aValue);    
                 break;
            default:
                throw new AssertionError();
        }
        data.set(rowIndex, tmp);
        this.fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void addLibro(Libro nuevoLibro){
        data.add(nuevoLibro);
        this.fireTableDataChanged();
    }
    
 
    
}
