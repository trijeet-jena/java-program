import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Legacy Java Applet example that adds two numbers. */
@SuppressWarnings("removal")
public class SumApplet extends Applet implements ActionListener {
    private final TextField firstField = new TextField(10);
    private final TextField secondField = new TextField(10);
    private final Label resultLabel = new Label("Sum: ");

    @Override
    public void init() {
        setLayout(new GridLayout(4, 2, 6, 6));
        add(new Label("First number:"));
        add(firstField);
        add(new Label("Second number:"));
        add(secondField);
        Button addButton = new Button("Add");
        addButton.addActionListener(this);
        add(addButton);
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            double first = Double.parseDouble(firstField.getText().trim());
            double second = Double.parseDouble(secondField.getText().trim());
            resultLabel.setText("Sum: " + (first + second));
        } catch (NumberFormatException exception) {
            resultLabel.setText("Enter valid numbers.");
        }
    }
}
