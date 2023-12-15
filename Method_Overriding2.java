
package com.mycompany.oopjava;
public class Method_Overriding2 extends  Method_Overriding{
    String gender;
    void dispaly(){
        System.out.println("name="+name);
       System.out.println("id="+id);
        System.out.println("gender="+gender);
    }
    public static void main(String[] args) {
        Method_Overriding2 ob=new Method_Overriding2();
            
        ob.gender="male";
        ob.id=101;
        ob.name="ibadullah saif";
        ob.dispaly();
        
        
    }
    
}
