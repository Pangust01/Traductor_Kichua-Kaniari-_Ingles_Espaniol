/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloTabla;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Persona;


/**
 *
 * @author 59398
 */
public class ModeloTablaPersonas extends AbstractTableModel {

    private Persona personaSeleccionado = null;
    private List<Persona> filasPersona = null;

    private String[] titulos = null;
    private int rowIndex;

    public ModeloTablaPersonas() {
        this.titulos = new String[]{"NOMBRE", "APELLIDO", "DNI", "CORREO", "DIRECCION"};
        this.filasPersona = new ArrayList<>();
    }

    
    @Override
    public int getRowCount() {
        return filasPersona.size();
    }

    @Override
    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        personaSeleccionado = filasPersona.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return personaSeleccionado.getNombre();
            case 1:
                return personaSeleccionado.getApellido();
            case 2:
                return personaSeleccionado.getDni();
            case 3:
                return personaSeleccionado.getCorreo();
            case 4:
            return personaSeleccionado.getDireccion();
                
            default:
                return null;
        }
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
                return String.class;
            case 5:
                return Date.class;
            default:
                return Object.class;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return titulos[columnIndex];
    }

    public void update(Persona object) {
        setPersonaSeleccionado(null);
        filasPersona.add(rowIndex, object);
        fireTableDataChanged();
    }

    public void addRow(Persona object) {
        filasPersona.add(filasPersona.size(), object);
        setPersonaSeleccionado(null);
    }

    public void deleteRow(Persona p) {
        filasPersona.remove(p);
        fireTableDataChanged();
        setPersonaSeleccionado(null);
    }

    public Persona getPersonaSeleccionado() {
        return personaSeleccionado;
    }

    public void setPersonaSeleccionado(Persona personaSeleccionado) {
        this.personaSeleccionado = personaSeleccionado;
    }

    public List<Persona> getFilasPersona() {
        return filasPersona;
    }

    public void setFilasPersona(List<Persona> filasPersona) {
        this.filasPersona = filasPersona;
    }


}
