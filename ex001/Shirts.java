package ex001;

public class Shirts extends Products {

    public int thickness;

    public Shirts(String name,double price,int amount,int thickness)
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
        return String.format("Your Product:<Shirt> %s -- %.2f -- %d -- %d",brand,price,amount,thickness);
    }

    public String toString() {
        return String.format("Shirt: %s, Price: %.2f, Amount: %d, Thickness: %d", brand, price, amount, thickness);
    }
    
}
