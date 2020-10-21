package com.pbo;

public class Main {

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        MyClass myObj2 = new MyClass(15);
        // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x }
        // Outputs 5
        System.out.println(myObj2.z);
        // Outputs 15
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
        // Outputs 1969 Mustang 
    }
}
