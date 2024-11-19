package accionPrestamo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author daxsa
 */
public class TablaAccionCellRenderP extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        PanelAccionP accion = new PanelAccionP();
        if (isSelected == false && row % 2 == 0) {
            accion.setBackground(Color.WHITE);
        } else {
            accion.setBackground(comp.getBackground());
        }
        return accion;
    }

}
