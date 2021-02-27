package com.company.DataStructure;

public class HeapPriorityQueue {
    private int[] items;
    private int size = 0;

    public HeapPriorityQueue(int max){
        items =  new int[max + 1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public int delMax(){
        int max = items[1];
        swap(items,1, size - 1);
        sink(1);
        return max;
    }

    public void insert(int item){
        size = size + 1;
        items[size] = item;
        swim(size);
    }

    public void swap(int[] arr, int i, int j){
        int item = arr[i];
        arr[i] = arr[j];
        arr[j] = item;
    }

    private void swim(int k){
        while (k > 1 && (items[k/2] < items[k])){
            swap(items,k, k/2);
            k = k / 2;
        }
    }

    private void sink(int k){
        while (2 * k <= size){
            int j = k * 2;
            if (j < size && items[j] < items[j+1]){
                j++;
            }
            if (k > j){
                break;
            }
            swap(items, k , j);
            k = j;
        }
    }
}
