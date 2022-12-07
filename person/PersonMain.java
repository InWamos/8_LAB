public class PersonMain
{
    public static void main(String[] args)
    {
        PersonArray pa = new PersonArray();
        // PersonArray pa1 = new PersonArray();

        pa.insert("John", "Doe", 23);
        pa.insert("Jane", "Lorem", 19);

        pa.displayArray();

        pa.delete("Lorem");

        pa.displayArray();
    }
}