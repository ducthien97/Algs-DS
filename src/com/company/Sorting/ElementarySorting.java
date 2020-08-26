package com.company.Sorting;
//import edu.princeton.cs.algs4.*;
public class ElementarySorting{
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int i, j, minI;
        for (i = 0; i < n - 1; i++){
            minI = i;
            for (j = i + 1; j < n; j++){
                if (arr[j] < (arr[minI])){
                    minI = j;
                }
            }
            swap(arr,minI,i);
        }
    }
    public static void bubbleSort(int[] arr){
        int lastUnsorted = arr.length - 1;
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++){
                if (arr[i + 1] > arr[i]){
                    swap(arr, i + 1, i);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void insertionSortBackward(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && arr[j] > arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    public static void generate(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * ((100) + 1));
        }
    }
    static void swap(int[] arr1, int i, int j){
        int temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = new int[20];
        generate(arr);
        System.out.println("Before sorting: ");
        print(arr);
        System.out.println();
        System.out.println("Sorting ascending");
        selectionSort(arr);
        print(arr);
        System.out.println();
        System.out.println("Sorting descending");
        bubbleSort(arr);
        print(arr);
        System.out.println();
        System.out.println("Sorting ascending");
        insertionSort(arr);
        print(arr);
        System.out.println();
        System.out.println("Sorting descending");
        insertionSortBackward(arr);
        print(arr);
    }
}
