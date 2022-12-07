public class PersonArray
{
    private Person[] people;
    private Person[] temp = new Person[100];
    private int count = 0; 

    public PersonArray()
    {
        people = new Person[0];
    }

    public void insert(String name, String surname, int age)
    {
        final Person person = new Person(name, surname, age);
        
        this.temp[this.count] = person;
        this.count++;
        people = new Person[this.count];

        for(int i = 0; i < this.count; i++)
        {
            this.people[i] = this.temp[i];
        }

        this.temp[this.count] = person;
    }

    public Object find(String lastName)
    {
        for(int i = 0; i < this.people.length; i++)
        {
            if(people[i].surname == lastName)
            {
                System.out.println(people[i].surname + " Found");
                return people[i];
            }
        }
        System.out.println(lastName + " not Found");
        return null;
    }

    public boolean delete(String lastNameDelete)
    {

        if (this.find(lastNameDelete) == null) return false;
        else
        {
            this.temp = this.people;
            for(int i = 0; i < this.people.length; i++)
            {
                if(this.temp[i].surname == lastNameDelete)
                {
                    this.temp[i] = null;
                }
            }

            this.people = new Person[this.temp.length - 1];
            count = 0;
            for(int i = 0; i < this.temp.length; i++)
            {
                if(this.temp[i] == null)
                {
                  count++;  
                } 
                else
                {
                    this.people[count] = this.temp[i];
                    count++;
                }
            }
            return true;
        }
    }

    public void displayArray()
    {
        for(int i = 0; i < this.people.length; i++)
        {
            this.people[i].displayPerson();
        }
    }
}