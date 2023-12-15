
package com.mycompany.oopjava;
public class Super_keyword1 extends Super_Keyword_1 {
    int x=5;
    void display(){
        System.out.println("result="+ super.x);
    }
    public static void main(String[] args) {
        Super_keyword1 ob=new Super_keyword1();
        ob.display();
            
        
    }
    
}
