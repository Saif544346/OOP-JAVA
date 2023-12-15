
package com.mycompany.oopjava;
public class SetterAndGettermethods {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   private int age;
   void display(){
       System.out.println("name="+name);
       System.out.println("age="+age);
   }
    
}
