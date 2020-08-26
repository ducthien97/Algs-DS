package com.company.Sorting;

public class SelectionSort implements Sorting{
    private static boolean less (Comparable a1, Comparable b1){
        return (a1.compareTo(b1) < 0);
    }
    private static boolean more(Comparable a1, Comparable b1){
        return (a1.compareTo(b1) > 0);
    }
    SwapTwoItems swapTwoItems = new SwapTwoItems();
    @Override
    public void sortLowHigh(Comparable[] arr) {
        int i,j,minI = 0;
        int n = arr.length;
        for (i = 0; i < n - 1; i++){
            minI = i;
            for (j = i + 1; j < n; j++){
                if (less(arr[j], arr[i])){
                    minI = j;
                }
            }
            swapTwoItems.swap(arr, minI,i);
        }
    }

    @Override
    public void sortHighLow(Comparable[] arr) {
        int i,j,maxI = 0;
        int n = arr.length;
        for (i = 0; i < n - 1; i++){
            maxI = i;
            for (j = i + 1; j < n; j++){
                if (more(arr[j], arr[i])){
                    maxI = j;
                }
            }
            swapTwoItems.swap(arr, maxI,i);
        }
    }
}
