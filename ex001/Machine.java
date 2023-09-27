package ex001;

import java.util.List;

public class Machine {

    private List<Products> products;
    
    public Machine(List<Products> products)
    {
        this.products = products;
    }

    public Shirts getShirts(double price)
    {
        for(Products products : products)
        {
            if(products instanceof Shirts)
            {
                Shirts shirts = (Shirts)products;
                if(shirts.GetPrice() == price)
                {
                    return shirts;
                }
            }
        }return null;
        
    }
}
