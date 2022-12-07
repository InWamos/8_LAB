final class TestAuthor
{
    public static void main(String[] args)
    {
        Author author1 = new Author("John", "john.doe@example.com", 'm');
        author1.toString();
        author1.setEmail("john@example.com");
        author1.toString();
    }
}