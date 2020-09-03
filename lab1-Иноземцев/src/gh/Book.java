package gh;

public class Book
{
    String name;
    String author;

    public Book(){}


    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    public void set_name(String name)
    {
        this.name = name;
    }

    public void set_author(String author)
    {
        this.author = author;
    }

    String get_name()
    {
        return this.name;
    }

    String get_author()
    {
        return this.author;
    }

    public void to_string()
    {
        System.out.println(this.name + " " + this.author);
    }
}
