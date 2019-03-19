public class Shape
{
    // Properties
    int x;
    int y;

    // Constructor
    public Shape( int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // Methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation( int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
