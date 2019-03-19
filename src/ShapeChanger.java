import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class ShapeChanger extends JFrame
{
    // Properties
    ShapeChangerPanel panel;
    JPanel shapes;
    JButton ellipse;
    JButton rectangle;

    // Constructor
    public ShapeChanger()
    {
        setPreferredSize( new Dimension( 600, 600) );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo( null);
        setVisible( true);
        panel = new ShapeChangerPanel();
        shapes = new JPanel();
        shapes.setLayout( new FlowLayout() );
        ellipse = new JButton( "Ellipse");
        rectangle = new JButton( "Rectangle");
        ellipse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setShape( new Ellipse( 25, 25, 300, 300));
            }
        });
        rectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //panel.setShape( new Rectangle( 25, 25, 300, 300));
            }
        });
        shapes.add( ellipse);
        shapes.add( rectangle);
        add( shapes, BorderLayout.SOUTH);
        add( panel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        ShapeChanger game = new ShapeChanger();
    }
}
