package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            System.out.println("Outer Loop: " + i);
            for(int j=0; j<5; j++){
                System.out.println("\tInner Loop " + j + ": Hi Everyone!"); // \t will indent my print statement
            }
        }
    }
}
