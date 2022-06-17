
package pizzadelivery;

public class PizzaDelivery {
    public static void main(String[] args) {
        Sifaris s1 = new Sifaris();
        s1.add(new Mozarella());
        s1.add(new Sucuk());
        
        System.out.println(s1.getCost());
    }
    
}
