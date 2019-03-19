import java.awt.*;

public class Rectangle extends Shape implements Locatable, Drawable
{
    // Properties
    int width;
    int height;

    // Constructor
    public Rectangle( int width, int height, int x, int y)
    {
        super( x, y);
        this.width = width;
        this.height = height;
    }

    // Methods
    @Override
    public void draw( Graphics g)
    {
        g.drawRect( x - width / 2, y - height / 2, width, height);
    }

    @Override
    public boolean contains( int x, int y)
    {
        if ( x - this.x <= width && y - this.y <= height)
        {
            return true;
        }
        return false;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
