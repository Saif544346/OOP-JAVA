
package com.mycompany.oopjava;


public class Constractor {
    String name,gender;
    int id;
    Constractor(String x,String y,int z){
        name=x;
        gender=y;
        id=z;
    }
   void dispaly(){
       System.out.println("name:"+name);
       System.out.println("gender:"+gender);
       System.out.println("id:"+id);
       System.out.println("  ");
   }
    
    
}
