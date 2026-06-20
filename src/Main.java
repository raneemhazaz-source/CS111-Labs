
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Formatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skills 30-8-25
 */
public class Main {
    public static void main(String[] args) {
        
    
   ArrayList<Product> P = new ArrayList<>();
    try{
   Scanner input = new Scanner(new File ("inputprducts.txt"));
while (input.hasNextLine()) {
        String type = input.next();
        String name= input.next();
        String id= input.next();
       double price = input.nextDouble();
   if (type.equals("E")) {
       int years = input.nextInt();
   P.add(new Eloctronics( years,name, id,  price));
}else if (type.equals("C")) {
       String size = input.next();
     P.add(new Clothing( size,  name,  id,  price));
  
    }else{
   throw new java.lang.IllegalArgumentException("invalid type!");
}
}
        System.out.println("prducts:"+P);
input.close();
Formatter output=new Formatter("outputprducts.txt");
for (int i = P.size()-1; i >=0; i--) {
   output.format("%s\n",P.get(i));
   }
output.close();
 
}catch(java.io.FileNotFoundException e){
  System.err.println("Error:"+e.getMessage());
}
    catch(java.util.InputMismatchException e){
    System.err.println("Error:"+e.getMessage());
}catch(java.lang.IllegalArgumentException e){
    System.err.println("Error:"+e.getMessage());
}catch(java.io.IOException e){
    System.err.println("Error:"+e.getMessage());
}catch(java.lang.Exception e){
    System.err.println("Error:"+e.getMessage());
}
}
}

