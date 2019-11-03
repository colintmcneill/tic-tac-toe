import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel {
    public GamePanel() {
        super();
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.setLayout(new GridLayout(3, 2, 3, 3));
        for (int i = 0; i < 9; i++) {
            JLabel cell = new JLabel("");
            cell.setBackground(Color.WHITE);
            cell.setOpaque(true);
            cell.setHorizontalAlignment(JLabel.CENTER);
            cell.setVerticalAlignment(JLabel.BOTTOM);
            cell.setFont(new Font("Sans Serif", Font.BOLD, 200));
            cell.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (SwingUtilities.isRightMouseButton(e)) {
                        cell.setText("o");
                    }
                    if (SwingUtilities.isLeftMouseButton(e)) {
                        cell.setText("x");
                    }
                }
            });
            this.add(cell);
        }
    }

}
