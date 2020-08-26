package com.company.Sorting;

public class BubbleSort implements Sorting{
    SwapTwoItems swap = new SwapTwoItems();


    private static boolean less (Comparable a1, Comparable b1){
        return (a1.compareTo(b1) < 0);
    }
    private static boolean more(Comparable a1, Comparable b1){
        return (a1.compareTo(b1) > 0);
    }
    @Override
    public void sortLowHigh(Comparable[] arr)  {
        int lastUnsorted = arr.length - 1;
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++){
                if (less(arr[i + 1], arr[i])){
                    swap.swap(arr, i + 1, i);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }

    @Override
    public void sortHighLow(Comparable[] arr) {
        int lastUnsorted = arr.length - 1;
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++){
                if (more(arr[i + 1], arr[i])){
                    swap.swap(arr, i + 1, i);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }


}
