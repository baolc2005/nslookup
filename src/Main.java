import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Main {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JLabel msglabel;

    public Main() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Main demo = new Main();
        demo.showJPanelDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du JPanel trong Java Swing");
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setLocationRelativeTo(null);
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(500, 500);
        msglabel = new JLabel("Chao mung ban den voi VietTuts.Vn", JLabel.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showJPanelDemo() {
        headerLabel.setText("Container in action: JPanel");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(msglabel);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
}