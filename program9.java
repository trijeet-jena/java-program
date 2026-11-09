import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/** A small Swing GUI that adds two numbers. */
public class program9 {
    private static void createAndShowGui() {
        JFrame frame = new JFrame("Sum Calculator");
        JTextField firstField = new JTextField();
        JTextField secondField = new JTextField();
        JLabel resultLabel = new JLabel("Enter two numbers and select Add.");
        JButton addButton = new JButton("Add");

        addButton.addActionListener(event -> {
            try {
                double first = Double.parseDouble(firstField.getText().trim());
                double second = Double.parseDouble(secondField.getText().trim());
                resultLabel.setText("Sum: " + (first + second));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(frame,
                        "Enter valid numbers in both fields.",
                        "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        });

        JPanel panel = new JPanel(new GridLayout(0, 2, 8, 8));
        panel.add(new JLabel("First number:"));
        panel.add(firstField);
        panel.add(new JLabel("Second number:"));
        panel.add(secondField);
        panel.add(addButton);
        panel.add(resultLabel);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(program9::createAndShowGui);
    }
}



