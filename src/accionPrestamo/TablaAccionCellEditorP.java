package accionPrestamo;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author daxsa
 */
public class TablaAccionCellEditorP extends DefaultCellEditor {

    private TablaAccionEventP ev;

    public TablaAccionCellEditorP(TablaAccionEventP ev) {
        super(new JCheckBox());
        this.ev = ev;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelAccionP accion = new PanelAccionP();
        accion.initEvent(ev, row);
        accion.setBackground(table.getBackground());
        return accion;
    }

}
