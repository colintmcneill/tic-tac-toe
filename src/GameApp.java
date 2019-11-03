import javax.swing.*;

public class GameApp extends JFrame {
    public GameApp(String title) {
        super(title);
        this.setSize(600,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GamePanel());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GameApp app = new GameApp("Tic-Tac-Toe");
    }
}
