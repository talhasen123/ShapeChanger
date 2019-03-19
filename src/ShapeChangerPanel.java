import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ShapeChangerPanel extends JPanel
{
    // Properties
    Ellipse shape;

    // Constructor
    public ShapeChangerPanel()
    {
        setPreferredSize( new Dimension( 500, 500) );
        shape = new Ellipse( 25, 25, 250, 250);
        addMouseListener( new MyMouseListener());
        addMouseMotionListener( new MyMouseListener());
    }
    // Methods
    @Override
    public void paintComponent( Graphics g)
    {
        super.paintComponent( g);
        shape.draw( g);
    }

    public void setShape( Ellipse shape)
    {
        this.shape = shape;
    }

    private class MyMouseListener extends MouseAdapter
    {
        int oldX;
        int oldY;
        int currentX;
        int currentY;

        @Override
        public void mouseDragged( MouseEvent e) {
            oldX = currentX;
            oldY = currentY;
            currentX = e.getX();
            currentY = e.getY();
            shape.setRadiusX(Math.abs(currentX - shape.getX()));
            shape.setRadiusY(Math.abs(currentY - shape.getY()));
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add( new ShapeChangerPanel() );
        frame.pack();
        frame.setLocationRelativeTo( null);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setVisible( true);
    }
}
