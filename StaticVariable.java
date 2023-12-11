
package com.mycompany.oopjava;
public class StaticVariable {
    String name;
    int id;
    static String university="Green University of Bangladesh";
    StaticVariable(String n,int i){
        name=n;
        id=i;
    }
    void dispaly(){
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("University Name="+university);
        System.out.println(" ");
        
    }
    
    
}
