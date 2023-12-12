
package com.mycompany.oopjava;
public class StaticBlock {
    static int id ;
    static String name;
    static{
        id=101;
        name="Ibadullah saif";
    }
   static void dispaly(){
        System.out.println("id="+id);
        System.out.println("name="+name);
    }
    public static void main(String[] args) {
        StaticBlock.dispaly();
        
    }
    
}
