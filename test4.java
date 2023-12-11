
package com.mycompany.oopjava;
public class test4 {
    public static void main(String[] args) {
        ConstractorOverloading ob1=new ConstractorOverloading("x","male",123445,111);
        ob1.display();
        ConstractorOverloading ob2=new ConstractorOverloading("y","male",234567);
        ob2.display();
        ConstractorOverloading ob3=new ConstractorOverloading(123,234567);
        ob3.display();
        ConstractorOverloading ob4=new ConstractorOverloading();
        ob4.display();
    }
    
}
