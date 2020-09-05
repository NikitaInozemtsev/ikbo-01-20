package gh;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball a = new Ball(23, 54);

        a.move(54, 23);

        System.out.println(a);
    }
}

class Ball
{
    private double x;
    private double y;

    public Ball()
    {
        x = 0.0;
        y = 0.0;
    }

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp)
    {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString()
    {
        return "Ball @ (" + x + ", " + y + ") " ;
    }
}