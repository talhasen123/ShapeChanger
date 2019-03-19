import java.awt.*;

public class Ellipse extends Shape implements Locatable, Drawable
{
    // Properties
    int radiusX;
    int radiusY;

    // Constructor
    public Ellipse( int radiusX, int radiusY, int x, int y)
    {
        super( x, y);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    // Methods
    @Override
    public void draw( Graphics g)
    {
        g.drawOval( x - radiusX, y - radiusY, 2 * radiusX, 2 * radiusY);
    }

    @Override
    public boolean contains( int x, int y)
    {
        if ( Math.pow( ( x - this.x ) / radiusX , 2) + Math.pow( ( y - this.y ) / radiusY , 2) <= 1 )
        {
            return true;
        }
        return false;
    }

    public void setRadiusX( int radiusX) {
        this.radiusX = radiusX;
    }

    public void setRadiusY( int radiusY) {
        this.radiusY = radiusY;
    }

    public int getRadiusX() {
        return radiusX;
    }

    public int getRadiusY() {
        return radiusY;
    }
}
