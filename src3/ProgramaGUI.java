import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaGUI extends JFrame {

    private JTextField textField;
    private JButton button;
    private JLabel imageLabel;

    public ProgramaGUI() {
        setTitle("Programa com Componentes Gráficos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        button = new JButton("Clique aqui");
        imageLabel = new JLabel();

        add(textField);
        add(button);
        add(imageLabel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoDigitado = textField.getText();
                JOptionPane.showMessageDialog(ProgramaGUI.this, "Texto digitado: " + textoDigitado);
            }
        });

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("bug.png"));
        imageLabel.setIcon(imageIcon);

        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgramaGUI().setVisible(true);
            }
        });
    }
}
