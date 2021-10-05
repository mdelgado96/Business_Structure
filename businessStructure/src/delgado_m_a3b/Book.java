/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delgado_m_a3b;

/**
 *
 * @author marvindelgado
 */
class Book extends Publication
{
    private String author;
    private double copies;
    
    // Empty constructor
    public Book (){}
    
    // Constructor
    public Book(String t, String a, String pub, int n, double p)
    {
        author = a;
        title = t;
        publisher = pub;
        nPages = n;
        price = p;
    }
    
    // Accessor 
    public String getAuthor()
    {
        return author;
    }
    // Accessor 
    public double getCopies()
    {
        return copies;
    }
    // Accessor 
    public String getTitle()
    {
        return title;
    }
    // Accessor
    public String getPublisher()
    {
        return publisher;
    }
    // Accessor
    public int getNPages()
    {
        return nPages;
    }
    // Accessor
    public double getPrice()
    {
        return price;
    }
    // Accessor
    public double getSalesValue()
    {
        return copies;
    }
    
    // Mutators
    public void setAuthor(String a)
    {
        author = a;
    }
    public void setCopies(double c)
    {
        copies = c;
    }
    public void setTitle(String t)
    {
        title = t;
    }
    public void setPublisher(String pub)
    {
        publisher = pub;
    }
    public void setNPages(int nP)
    {
        nPages = nP;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    
    // Calculate sales interface
    interface CalculateSales
    {
        double setSalesValue();
        void getSalesValue(double c);
    }
    // Define salesValue method
    public double setSalesValue(double c)
    {
        c = (price * nPages) * 0.02;
        return c;
    }
    
    // toString method
    public String toString()
    {
        String str;
        str = String.format("The book %s has "
                + "total sales of $%.2f\n"
                +" The book '%s' written by %s and published by %s has %d pages and costs $%.2f\n\n", 
                getTitle(), getSalesValue(), getTitle(), getAuthor(), getPublisher(), 
                getNPages(), getPrice());
        
        return str;
    }
    
    // equals method
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Book))
            return false;
        else 
        {
            Book objBook = (Book) obj;
            if (title.equals(objBook.title) && publisher.equals(objBook.publisher)
                    && nPages == objBook.nPages && price == objBook.price
                    && author.equals(objBook.author))
                return true;
            else 
                return false;
        }
    }
    
}
