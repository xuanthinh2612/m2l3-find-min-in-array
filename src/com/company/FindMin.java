package com.company;

import java.util.Scanner;

public class FindMin {

    public static void main(String[] args) {
	// write your code here
       int[] arr = new FindMin().insert();
       int min = new FindMin().find(arr);
        System.out.println("Min is:\t"+min);
    }
    public int[] insert () {
       Scanner scanner =  new Scanner(System.in);
        System.out.println("please insert array size (size < 20)");
        int size = scanner.nextInt();
        while (size>20){
            System.out.println("Please insert array size again (size<20)");
        }
        int[] arr = new int[size];
        System.out.println("please insert array element");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public int find(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
