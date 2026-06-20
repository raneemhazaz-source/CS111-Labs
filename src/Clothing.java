/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Clothing extends Product{
    private String size;

    public Clothing(String size, String name, String id, double price) throws IllegalArgumentException {
        super(name, id, price);
       setSize( size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size==null || size.isEmpty()) {
           throw new java.lang.IllegalArgumentException("INVALID SIZE!");
        }
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+"Clothing{" + "size=" + size + '}';
    }
    
}
