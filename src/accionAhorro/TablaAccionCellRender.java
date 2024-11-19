package accionAhorro;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import accionAhorro.PanelAccion;

/**
 *
 * @author daxsa
 */
public class TablaAccionCellRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        
        PanelAccion accion = new PanelAccion();
        if(isSelected == false && row % 2 == 0){
             accion.setBackground(Color.WHITE);
        }else{
         accion.setBackground(comp.getBackground());   
        }
        return accion;
    }
    
}
