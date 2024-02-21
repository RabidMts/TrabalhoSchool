import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class LabelFrame extends JFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame()
    {
        super("TestingJlabel");
        setLayout (new FlowLayout());
        label1= new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO. ");
        label1.setToolTipText("este é");
        add (label1);

        Icon bug = new ImageIcon( getClass().getResource("bug.png"));
        label2 = new JLabel("CUIABA", bug, SwingConstants.LEFT);
        label2.setToolTipText("este é 2");
        add(label2);

        label3= new JLabel("IFMT");
        label3.setText("");

        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("este é 3");
        add(label3);

    }
}