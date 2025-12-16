package JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;  
//method reference stream
class Product1{  
    int id;  
    String name;  
    float price;  
      
    public Product1(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class JavaStreamExample10 {  
  
    public static void main(String[] args) {  
          
        List<Product1> productsList = new ArrayList<Product1>();  
          
        //Adding Products  
        productsList.add(new Product1(1,"HP Laptop",25000f));  
        productsList.add(new Product1(2,"Dell Laptop",30000f));  
        productsList.add(new Product1(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product1(4,"Sony Laptop",28000f));  
        productsList.add(new Product1(5,"Apple Laptop",90000f));  
          
        List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Product1::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
    }  
}  