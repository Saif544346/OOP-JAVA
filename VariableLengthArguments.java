
package com.mycompany.oopjava;
public class VariableLengthArguments {
    void add(int ... num){
        int sum=0;
        for(int x:num){
            sum=sum+x;
        }
        System.out.println("Result="+sum);
    }
    public static void main(String[] args) {
        VariableLengthArguments ob= new VariableLengthArguments();
        ob.add(12,43,54,67,85,56);
        
    }
    
}
