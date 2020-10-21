package com.pbo;

public class Main2 {

    public static void main(String[] args) {
        MyClass myObj1 = new MyClass();    // Object 1
        MyClass myObj2 = new MyClass();   // Object 2
        MyClass myObj3 = new MyClass();  // Modify Attribute
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs S
        System.out.println(myObj2.x); // Outputs 25
        System.out.println(myObj3.z); // Outputs 10
    }
}
