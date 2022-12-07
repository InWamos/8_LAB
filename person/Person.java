public class Person
{
    protected String name;
    protected String surname;
    private int age;

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void displayPerson()
    {
        System.out.println("\n_\n|[NAME]: " + this.name 
                           + "\n|[SURNAME]: " + this.surname
                           + "\n|[AGE]: " + this.age
                           + "\n‾"); 
    }

    public String getLast()
    {
        return this.surname;
    }
}