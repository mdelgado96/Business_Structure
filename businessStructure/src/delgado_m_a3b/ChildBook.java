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
class ChildBook extends Book {
    private int minAge, maxAge;
    private double copies;
    private String author;
    
    // Empty Contructor
    public ChildBook(){}
    
    // Constructor
    public ChildBook(String t, String a, String pub, int n, double p, int mnAge, int mxAge)
    {
        super(t, a, pub, n, p);
        minAge = mnAge;
        maxAge = mxAge;
    }
    
    // Accessor
    public String getAuthor()
    {
        return author;
    }
    // Accessor
    public int getMinAge()
    {
        return minAge;
    }
    // Accessor 
    public int getMaxAge()
    {
        return maxAge;
    }
    
    // Mutator
    public void setAuthor(String a)
    {
        author = a;
    }
    // Accessor 
    public double getCopies()
    {
        return copies;
    }
    // Mutator
    public void setCopies(double c)
    {
        copies = c;
    }
    // Mutator
    public void setMinAge(int nAge)
    {
        minAge = nAge;
    }
    
    // Mutator
    public void setMaxAge(int xAge)
    {
        maxAge = xAge;
    }
    
    // Calculate sales interface
    interface CalculateSales
    {
        double setSalesValue();
        void getSalesValue(double c);
    }
    
    // Accessor
    public double getSalesValue()
    {
        return copies;
    }
    
    // Define salesValue method
    public double setSalesValue(double c)
    {
        c = (price * nPages) * 0.35;
        return c;
    }
    
    // toString method
    public String toString()
    {
        String str;
        str = String.format("The child book %s has "
                + "total sales of $%.2f\n"
                +" The children's book '%s' written by %s and published by"
                + " %s has %d pages and costs $%.2f\n"
                + "The minimum age for the book is %d\n"
                + "The maximum age for the book is %d\n\n", 
                getTitle(), getSalesValue(), getTitle(), getAuthor(), getPublisher(), 
                getNPages(), getPrice(), getMinAge(), getMaxAge());
        
        return str;
    }
    
    // equals method
    public boolean equals(Object obj)
    {
        if(!(obj instanceof ChildBook))
            return false;
        else 
        {
            ChildBook objBook = (ChildBook) obj;
            if (title.equals(objBook.title) && publisher.equals(objBook.publisher)
                    && nPages == objBook.nPages && price == objBook.price
                    && author.equals(objBook.author) && minAge == objBook.minAge
                    && maxAge == objBook.maxAge)
                return true;
            else 
                return false;
        }
    }
    
}
