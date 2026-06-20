/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Product {
  private String name;
private String id;
private double price;

    public Product(String name, String id, double price)throws java.lang.IllegalArgumentException {
        this.name = name;
        this.id = id;
        setPrice( price) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0 ) {
          throw new java.lang.IllegalArgumentException("INVALID PRICE!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", id=" + id + ", price=" + price + '}';
    }

}
