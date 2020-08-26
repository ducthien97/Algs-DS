package com.company.Sorting;

public class MergeSort implements Sorting{
    private static boolean less (Comparable a1, Comparable b1){
        return (a1.compareTo(b1) < 0);
    }
    private static boolean more(Comparable a1, Comparable b1){
        return (a1.compareTo(b1) > 0);
    }

    public void mergeHL(Comparable[] arr, Comparable[] leftArr, Comparable[] rightArr){
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        //arr = new Comparable[leftSize + rightSize];
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < leftSize && r < rightSize){
            if (more(rightArr[r],leftArr[l])){
                arr[i] = rightArr[r];
                i++;
                r++;
            }
            //else if (less(rightArr[r],leftArr[l])) {
            else
            {    arr[i] = leftArr[l];
                l++;
                i++;
            }
        }
        while (l < leftSize){
            arr[i] = leftArr[l];
            l++;
            i++;
        }
        while (r < rightSize){
            arr[i] = rightArr[r];
            r++;
            i++;
        }
    }
    public void mergeLH(Comparable[] arr, Comparable[] leftArr, Comparable[] rightArr){
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        //arr = new Comparable[leftSize + rightSize];
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < leftSize && r < rightSize){
            if (less(leftArr[l], rightArr[r])){
                arr[i] = leftArr[l];
                i++;
                l++;
            }
            else {
                arr[i] = rightArr[r];
                r++;
                i++;
            }
        }
        while (l < leftSize){
            arr[i] = leftArr[l];
             l++;
            i++;
        }
        while (r < rightSize){
            arr[i] = rightArr[r];
            r++;
            i++;
        }
    }





    @Override
    public void sortLowHigh(Comparable[] arr) {
        int n = arr.length;
        if (n >= 2){
            int mid = n/2;
            Comparable[] leftArr = new Comparable[mid];
            Comparable[] rightArr = new Comparable[n - mid];
            int k = 0;
            for (int i = 0; i < n; i++){
                if (i < mid){
                    leftArr[i] = arr[i];
                }
                else{
                    rightArr[k] = arr[i];
                    k++;
                }
            }
            sortLowHigh(leftArr);
            sortLowHigh(rightArr);

            mergeLH(arr, leftArr,rightArr);

        }
        else{
            return;


        }
    }

    @Override
    public void sortHighLow(Comparable[] arr) {
        int n = arr.length;
        if (n >= 2){
            int mid = n/2;
            Comparable[] leftArr = new Comparable[mid];
            Comparable[] rightArr = new Comparable[n - mid];
            int k = 0;
            for (int i = 0; i < n; i++){
                if (i < mid){
                    leftArr[i] = arr[i];
                }
                else{
                    rightArr[k] = arr[i];
                    k++;
                }
            }
            sortHighLow(leftArr);
            sortHighLow(rightArr);

            mergeHL(arr, leftArr, rightArr);

        }
        else{
            return;


        }
    }
}
