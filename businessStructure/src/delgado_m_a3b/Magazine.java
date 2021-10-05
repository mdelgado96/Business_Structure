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
class Magazine extends Publication{
    //static Magazine pubUnit;
    public enum pubUnit{
        MONTHLY, WEEKLY, BIWEEKLY
    }
    private pubUnit nUnit;
    private double copies;
    
    // Empty Constructor
    public Magazine (){}

    // Constructor
    public Magazine(String t, String pub, int n, double p, pubUnit pUnit)
    {
        nUnit = pUnit;
        title = t;
        publisher = pub;
        nPages = n;
        price = p;
    }
    
    // Accessor
    public pubUnit getPubUnit()
    {
        return nUnit;
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
    public void setPubUnit(pubUnit nUnit)
    {
        this.nUnit = nUnit;
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
    
    // Method for salesValue with assumed 40% discount
    public double setSalesValue(double c)
    {
        c = (price * copies) * 0.04;
        return c;
    }
    
    
    // toString method
    public String toString()
    {
        String str;
        str = String.format("The magazine %s has "
                + "total sales of $%.2f\n"
                +" The magazine %s published by %s on a " + nUnit 
                + " basis has %d pages and costs $%.2f\n\n", 
                getTitle(), getSalesValue(), getTitle(), getPublisher(), 
                getNPages(), getPrice());
        
        return str;
    }
    
    // equals method
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Magazine))
            return false;
        else 
        {
            Magazine objMagazine = (Magazine) obj;
            if (title.equals(objMagazine.title) && publisher.equals(objMagazine.publisher)
                    && nPages == objMagazine.nPages && price == objMagazine.price
                    && nUnit.equals(objMagazine.nUnit))
                return true;
            else 
                return false;
        }
    }
}
