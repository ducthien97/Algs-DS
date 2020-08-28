package com.company;

import com.company.Sorting.BubbleSort;
import com.company.Sorting.ElementarySorting;
import com.company.Sorting.MergeSort;
import com.company.Sorting.SelectionSort;

public class MainAlgo {

    public static void printArray(Comparable[] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
	// write your code here

        Comparable[] arr = {1,3,8,6,9,5,0,0,5,9};
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        bubbleSort.sortLowHigh(arr);
        System.out.println("Bubble Sort");

        printArray(arr);

        System.out.println(" ");
        bubbleSort.sortHighLow(arr);

        printArray(arr);

        System.out.println("\n Selection Sort");

        selectionSort.sortLowHigh(arr);

        printArray(arr);

        selectionSort.sortHighLow(arr);
        System.out.println();
        printArray(arr);

        MergeSort mergeSort = new MergeSort();
        Comparable[] arrL = {7,5,3,1};
        Comparable[] arrR = {8,6,2,0};
        Comparable[] arrEd = new Comparable[8];
        System.out.println();
        //mergeSort.mergeHL(arrEd,arrL, arrR);
        //printArray(arrEd);
        //mergeSort.merge(arrEd,arrL,arrR);
        mergeSort.sortLowHigh(arr);
        System.out.println("\nMerge sort");

        printArray(arr);
        System.out.println();
        mergeSort.sortHighLow(arr);
        printArray(arr);

    }
}
