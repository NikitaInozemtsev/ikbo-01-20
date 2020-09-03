package gh;

public class Dog
{
    private String color;
    private String breed;
    private String name;

    public Dog(){}


    public Dog(String color, String breed, String name)
    {
        this.color = color;
        this.breed = breed;
        this.name = name;
    }
    public void voice()
    {
        System.out.println("Гав!");
    }

    public void to_string()
    {
        System.out.println(this.color + " " + this.breed + " " + this.name);
    }

    void set_color(String color)
    {
        this.color = color;
    }

    void set_breed(String breed)
    {
        this.breed = breed;
    }

    void set_name(String name)
    {
        this.name = name;
    }

    String get_color()
    {
        return this.color;
    }

    String get_breed()
    {
        return this.breed;
    }

    String get_name()
    {
        return this.name;
    }
}
