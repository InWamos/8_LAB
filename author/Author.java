public class Author
{
    protected String name;
    protected String email;
    protected char gender;

    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;

        switch (gender)
        {
            case 'm':
                this.gender = gender;
                return;
            
            case 'f':
                this.gender = gender;
                return;

            default:

                throw new Error(); 
        }
    }

    public String getName()
    {
        System.out.println("[NAME]: " + this.name);
        return this.name;
    }

    public char getGender()
    {
        System.out.println("[GENDER]: " + this.gender);
        return this.gender;
    }

    public String getEmail()
    {
        System.out.println("[EMAIL]: " + this.email);
        return this.email;
    }

    public void setEmail(String new_email)
    {
        System.out.println(new_email + " Is author's new email");
        this.email = new_email;
    }

    public String toString()
    {
        final String toStringOutput = this.name + " (" + this.gender + ") at " + this.email;
        
        System.out.println(toStringOutput);
        return toStringOutput;
    }
}