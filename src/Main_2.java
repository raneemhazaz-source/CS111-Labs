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
      
        Bank b = new Bank ("123",150000.00,"RANEEM","@333333");
         Svaeing s = new   Svaeing(150.0 ,"444m",70000.00,"rEEM","@555") ;
         Psvaeing p = new Psvaeing(50.0,170.0 ,"777m",80000.00,"EEM","@6666");
Bank [] bn = new Bank[3];
bn [0] = b;
bn [1] = s;
bn [2] = p;

        for (Bank bk : bn) {
            if (bk instanceof  Psvaeing) {
                System.out.println(((Psvaeing) bk).getType());
                System.out.println(((Psvaeing) bk).getRate());  
                  System.out.println(bk.getClass().getSimpleName());
            }
  
        }
        Bank b2 = new Bank ("123",600000.0,"NEEM","@000000");
        System.out.println("result:"+ b2.equals(b));
         procceeA( b);
          procceeA(s);
           procceeA(p);
            found(bn ,b);
    }
   public static void procceeA(Bank  b) {
       System.out.println(b.getType());
       
       if (b instanceof Svaeing) {
           System.out.println(((Svaeing) b).getRate());
       }
       System.out.println(b.getBalnce());
       }
   public static Bank found(Bank [] n ,Bank k){
       for (Bank ba : n) {
           if (ba.equals(k)) {
               System.out.println("founde");
              return ba; 
           }
  
       }return null;
   }
   
   }

