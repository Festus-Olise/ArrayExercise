package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] anArray = getIntegers(5);

        System.out.println("Array before sorting is: ");
        printArray(anArray);

        System.out.println("Array after sorting is: ");
        printArray((sortIntegers(anArray)));
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Please enter " + capacity + "integer values below:\r");
        int[] integerArray = new int[capacity];
        for (int i = 0; i<capacity; i++) {
            integerArray[i] = scanner.nextInt();
        }
        return integerArray;
    }

    public static void printArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Array element at [" + i + "] is " + array[i]);
        }
    }

    public static int[] sortIntegers (int[] arrayToSort) {
        int[] sortedArray = new int[arrayToSort.length];
        //tempArray = Arrays.copyOf(arrayToSort, arrayToSort.length);

        //manual array copy - this is optimized in the next code block to use system array copy
        /*for(int i = 0; i < arrayToSort.length; i++) {
            sortedArray[i] = arrayToSort[i];
        }*/

        //system array copy
        System.arraycopy(arrayToSort, 0, sortedArray, 0, arrayToSort.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        //Arrays.sort(sortedArray);

        return sortedArray;
    }
}
