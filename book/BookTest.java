final class BookTest
{

    public static void main(String[] args)
    {
        Author author0 = new Author("Jane","jane@upb.ro",'f');
        Author author1 = new Author("John","john@upb.ro",'m');

        Book book0 = new Book("new_book", author0, 300, 88);
        
        Book book1= new Book("old_book", author1, 29.95, 28);

        book0.toString();
        book1.toString();

        book0.getAuthorName();
        book0.getAuthorEmail();
        book0.getAuthorGender();

        book1.getAuthorName();
        book1.getAuthorEmail();
        book1.getAuthorGender();
    }
}