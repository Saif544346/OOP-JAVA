
package com.mycompany.oopjava;
public class ConstractorOverloading {
    String name,gender;
    int phn,id;
    ConstractorOverloading(String n,String x,int k,int l){
        name=n;
        gender=x;
        phn=k;
        id=l;
        
        
    }
    ConstractorOverloading(String n,String x,int k){
        name=n;
        gender=x;
        phn=k;
    }
    ConstractorOverloading(int k,int l){
        phn=k;
        id=l;
    }
    ConstractorOverloading(){
        System.out.println("default");
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("name:"+phn);
        System.out.println("name:"+id);
        System.out.println(" ");
        
    }
    
}
