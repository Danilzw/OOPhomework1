package ex001;

public class Program
{
    public static void main(String[] args) {
        

        Products products = new Products("StartUP",19.990,90);
        System.out.println(products.printino());

        Products shirts = new Shirts("StartUP",20,20,95);
        System.out.println(shirts.printino());

        Products hats = new Hats("StartUP",10,10,110);
        System.out.println(hats.printino());

        Products Pants = new Pants("StartUP",10.99,15,160);
        System.out.println(Pants.printino());
    }
}