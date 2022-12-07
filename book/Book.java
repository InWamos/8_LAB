public class Book extends Author
{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price)
    {
        super(author.name, author.email, author.gender);
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qtyInStock)
    {
        super(author.name, author.email, author.gender);
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName()
    {
        System.out.println("\n[BOOK NAME]: " + this.name);
        return this.name;
    }

    public Author getAuthor()
    {
        return this.author;
    }

    public String getAuthorName()
    {
        System.out.println("_\n|[AUTHOR NAME]: " + this.author.name);
        return this.author.name;
    }

    public String getAuthorEmail()
    {
        System.out.println("|[AUTHOR EMAIL]: " + this.author.email);
        return this.author.email;
    }

    public char getAuthorGender()
    {
        System.out.println("|[AUTHOR GENDER]: " + this.author.gender + "\n‾");
        return this.author.gender;
    }

    public double getPrice()
    {
        System.out.println("\n[BOOK PRICE]: " + this.price);
        return this.price;
    }

    public int getQtyInStock()
    {
        System.out.println("\n[BOOKS IN STOCK]: " + this.qtyInStock);
        return this.qtyInStock;
    }

    public void setQtyInStock(int newQty)
    {

        this.qtyInStock = newQty;
        System.out.println("\n[NEW QUANTITY]: " + this.qtyInStock);
        
    }

    public void setPrice(int newPrice)
    {

        this.price = newPrice;
        System.out.println("\n[NEW PRICE]: " + this.price);
        
    }

    public String toString()
    {
        final String output = '\n' 
                              + getName() 
                              + " by " + this.author.name 
                              + " (" + this.author.gender
                              + ") at " 
                              + this.author.email;
        
        System.out.println(output);
        return output;
    }
}