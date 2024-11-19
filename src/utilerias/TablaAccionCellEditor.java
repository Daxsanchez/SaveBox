package utilerias;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import paneles.PanelAccion;

/**
 *
 * @author daxsa
 */
public class TablaAccionCellEditor extends DefaultCellEditor{

    private TablaAccionEvent ev;
    
    public TablaAccionCellEditor(TablaAccionEvent ev) {
        super(new JCheckBox());
        this.ev = ev;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelAccion accion = new PanelAccion();
        accion.initEvent(ev, row);
        accion.setBackground(table.getBackground());
        return accion;
    }
    
}
