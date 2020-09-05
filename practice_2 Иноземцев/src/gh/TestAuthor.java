package gh;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author a = new Author("Alex", "yu", 'M');

        System.out.println(a);

        a.setEmail("restore");

        System.out.println(a);
    }
}

class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public char getGender()
    {
        return gender;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender;
    }
}
