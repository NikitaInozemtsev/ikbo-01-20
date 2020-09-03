package gh;

public class Ball
{
    private String type;
    private String maker;
    private String color;

    public Ball(){}


    public Ball(String type, String maker, String color)
    {
        this.type = type;
        this.maker = maker;
        this.color = color;
    }

    public void set_type(String type)
    {
        this.type = type;
    }

    public void set_maker(String maker)
    {
        this.maker = maker;
    }

    public void set_color(String color)
    {
        this.color = color;
    }

    public String get_type()
    {
        return this.type;
    }

    public String get_maker()
    {
        return this.maker;
    }

    public String get_color()
    {
        return this.color;
    }

    public void to_string()
    {
        System.out.println(this.type + " " + this.maker + " " + this.color);
    }
}
