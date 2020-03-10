package com.nathan;

import com.nathan.arrays.MyArray;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        myArrayPresentation();
    }

    public static void myArrayPresentation() {
        MyArray myArray = new MyArray(3);
        myArray.insert(10);
        myArray.insert(20);
        myArray.insert(30);
        System.out.println("normal insert: " + myArray);
        myArray.insert(40);
        System.out.println("out of boundary insert: " + myArray);
        myArray.removeAt(2);
        System.out.println("first remove: " + myArray);
        myArray.removeAt(1);
        System.out.println("second remove: " + myArray);
        System.out.println("index of 40: " + myArray.indexOf(40));
    }
}
