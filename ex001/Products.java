package ex001;

public class Products {
    
    protected String brand;
    protected double price;
    protected int amount;

    public Products(String brand,double price,int amount)
    {
        if(brand.length() < 3 || brand.length() > 9)
        {
            this.brand = "<Brand>";
        }
        else
        {
            this.brand = brand;
        }
        if(price < 9 || price > 99)
        {
            this.price = 0;
        }
        else
        {
            this.price = price;
        }
        if(amount < 1 || amount > 99)
        {
            this.amount = 0;
        }
        else{
            this.amount = amount;
        }
    }


    public String printino()
    {
        return String.format("Your Product: %s -- %.2f -- %d",brand,price,amount);
    }
   
}
