package ex001;
public class Pants  extends Products{
    
    public int thickness;

    public Pants(String name,double price,int amount,int thickness)
    {
        super(name, price, amount);
        if(thickness < 90 || thickness > 250)
        {
            this.thickness = 0;
        }
        else{
            this.thickness = thickness;
        }
    }

    public double GetPrice()
    {
        return price;
    }
    
    public String printino()
    {
        return String.format("Your Product:<Pants> %s -- %.2f -- %d -- %d",brand,price,amount,thickness);
    }
}
