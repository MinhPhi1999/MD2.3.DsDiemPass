package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập điểm "+(i+1) +":");
            array[i]=scanner.nextInt();
        }
        int count = 0;
        System.out.println("list điểm: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+ "\t");
            if (array[i]>=5 && array[i]<=10){
                count++;
            }
        }
        System.out.println("\n The number of students passing the exam is " + count);

    }
}
