package ex001;

public class Hats extends Products {

    public int thickness;

    public Hats(String name,double price,int amount,int thickness)
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

    public String printino()
    {
        return String.format("Your Product:<Hats> %s -- %.2f -- %d -- %d",brand,price,amount,thickness);
    }
    
}
