package gh;

class Test
{
    public static void main(String[] args)
    {
        Dog a = new Dog("Черный", "Дворняга", "Дина");
        a.to_string();
        a.voice();

        Ball b = new Ball();

        b.set_color("green");
        b.set_maker("nike");
        b.set_type("football");

        b.to_string();

        Book c = new Book("Война и мир", "Л.Толстой");
        System.out.println(c.get_name() + " " + c.get_author());

    }
}

