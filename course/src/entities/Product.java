package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;


    public double totalValueInStock() {

        return this.price * quantity;

    }

    public int addProductInStock(int quantity) {

        return  this.quantity += quantity;

    }
    
    public int removeProductInStock(int quantity) {

        return  this.quantity -= quantity;

    }
    
    public String toString() {
    	return name
    			+", $ "
    			+price
    			+", "
    			+quantity
    			+" units, Total: $ "
    			+totalValueInStock();
    }


}