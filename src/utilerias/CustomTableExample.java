package utilerias;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class CustomTableExample extends JFrame {

    public CustomTableExample() {
        setTitle("Tabla Personalizada");
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Datos de la tabla
        String[] columnNames = {"Nombre del Socio", "Fecha", "Socio ID", "Tipo", "Estado"};
        Object[][] data = {
            {"Luis Ramirez Flores", "19 de Noviembre del 2024", "LU12RF90", "Préstamo", "Pendiente"},
            {"Luis Ramirez Flores", "19 de Noviembre del 2024", "LU12RF90", "Préstamo", "Pendiente"},
            {"Luis Ramirez Flores", "19 de Noviembre del 2024", "LU12RF90", "Préstamo", "Pendiente"}
        };

        // Crear la tabla con un modelo
        JTable table = new JTable(data, columnNames);
        table.setRowHeight(30);

        // Personalizar el encabezado
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 14));
        header.setBackground(new Color(7, 20, 123)); // Azul oscuro
        header.setForeground(Color.WHITE);

        // Personalizar las celdas
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setFont(new Font("Arial", Font.PLAIN, 12));
                if (column == 4 && "Pendiente".equals(value)) {
                    cell.setForeground(Color.ORANGE);
                } else {
                    cell.setForeground(Color.BLACK);
                }
                setHorizontalAlignment(SwingConstants.LEFT);
                return cell;
            }
        };

        // Aplicar el renderizador a todas las columnas
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }

        // Agregar la tabla dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CustomTableExample::new);
    }
}
