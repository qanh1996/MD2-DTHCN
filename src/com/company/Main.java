package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width:");
        width = sc.nextFloat();
        System.out.println("Enter height:");
        height = sc.nextFloat();
        float arena = width * height;
        System.out.println("Area is:" + arena);
    }
}
