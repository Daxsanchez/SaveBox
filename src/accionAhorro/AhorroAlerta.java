package accionAhorro;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author daxsa
 */
public class AhorroAlerta extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        String[] partes = value.toString().split(" ");
        Double ahorroPendiente = Double.valueOf(partes[0]);
        if (isSelected == false) {
            if (ahorroPendiente > 0) {
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
