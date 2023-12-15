
package com.mycompany.oopjava;
public class Super_keyword_B extends Super_keyword_A{
    void display(){
        super.display();
        System.out.println("i am from class B");
    }
    public static void main(String[] args) {
        Super_keyword_B ob =new Super_keyword_B ();
        ob.display();
        
    }
    
}
