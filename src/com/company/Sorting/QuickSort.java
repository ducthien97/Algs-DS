package com.company.Sorting;

public class QuickSort {
    public static int partition (int[] arr, int l, int h){
        int i = l;
        int j = h;
        int pivot = arr[i];
        while (i < j){
            while(arr[i] <= pivot){
                if (i < arr.length - 1){ //avoid i to go above array index
                    i++;
                }
                else{
                    break; //avoid infinite loop
                }
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr,l, j);
        return j;
    }
    public static void QuickSort(int[] arr, int l, int h){
        if (l < h){
            int j = partition(arr, l, h);
            QuickSort(arr, l, j-1);
            QuickSort(arr,j + 1, h);
        }
        else{
            return;
        }

    }
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {10,16,8,12,15,6,3,9,17,8,8,17,25,18,41,255,751,100,109,208,411};
        int n = arr.length-1;
        QuickSort(arr,0,n);
        printArray(arr);
    }
}
