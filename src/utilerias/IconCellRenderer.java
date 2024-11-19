package utilerias;

import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author daxsa
 */
public class IconCellRenderer extends DefaultTableCellRenderer {

    public IconCellRenderer() {
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof Icon) {
            setIcon((Icon) value);
            setText(null);
        } else {
            super.setValue(value);
        }
    }
}
