package accionPrestamo;

import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author daxsa
 */
public class InteresAlerta extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        String[] partes = value.toString().split(" ");
        Double interesPendiente = Double.valueOf(partes[0]);
        if (isSelected == false) {
            if (interesPendiente > 0) {
                comp.setBackground(Color.RED);
            } else {
                comp.setBackground(Color.WHITE);
            }
        } else {
            comp.setBackground(comp.getBackground());
        }
        return comp;
    }

}
