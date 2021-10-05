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
abstract class Publication {
    protected String title;
    protected String publisher;
    protected int nPages;
    protected double price;
    public abstract String getTitle();
    public abstract String getPublisher();
    public abstract int getNPages();
    public abstract double getPrice();
    public abstract void setTitle(String t);
    public abstract void setCopies(double c);
    public abstract void setPublisher(String pub);
    public abstract void setNPages(int nP);
    public abstract void setPrice(double p);
    public abstract String toString();
    public abstract boolean equals(Object obj);

}
