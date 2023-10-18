package gui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GraphicEditor {
    private final Color snowWhite = new Color(255, 250, 250);
    private final Color lavender = new Color(226, 209, 249);
    private final Color teal = new Color(49, 119, 115);

    public void setFrameGraphic(JFrame frame) {
        frame.getContentPane().setBackground(snowWhite);
    }

    public void setMainPanelGraphic(JPanel panel) {
        panel.setBackground(lavender);
    }

    public void setInfoPanelGraphic(JPanel panel) {
        panel.setBackground(teal);
    }

    public void setTitleFormat(JLabel title) {
        title.setFont(new Font("Monospaced", Font.BOLD, 30));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setForeground(teal);
    } // end of setFontAndSize method

    public void setAppHeadingFormat(JLabel heading) {
        heading.setFont(new Font("Monospaced", Font.BOLD, 22));
        heading.setForeground(lavender);
    } // end of setAppHeadingFormat method

    public void setFontFormat(JLabel label) {
        label.setFont(new Font("Monospaced", Font.BOLD, 25));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(teal);
    } // end of setFontFormat method

    public void setFontFormat(JTextField textField) {
        textField.setFont(new Font("Monospaced", Font.BOLD, 25));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setDisabledTextColor(lavender);
        textField.setBackground(teal);
        textField.setForeground(lavender);

        Border customBorder = new LineBorder(snowWhite, 4);
        textField.setBorder(customBorder);
    } // end of setFontFormat method

    public void setFontFormat(JButton button) {
        button.setFont(new Font("Monospaced", Font.BOLD, 16));
        button.setBackground(teal);
        button.setForeground(lavender);
    } // end of setFontFormat method

    public JScrollPane setTable(String[][] data, String[] columns) {
        DefaultTableModel model = new DefaultTableModel(data, columns);

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        table.setOpaque(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setFont(new Font("Monospaced", Font.BOLD, 18));
        table.setFont(new Font("Monospaced", Font.BOLD, 14));

        table.setBackground(lavender);
        table.setForeground(teal);
        table.getTableHeader().setBackground(teal);
        table.getTableHeader().setForeground(lavender);
        scrollPane.getViewport().setBackground(teal);
        scrollPane.getVerticalScrollBar().setBackground(teal);

        return scrollPane;
    } // end of setTable method
} // end of GraphicEditor class
