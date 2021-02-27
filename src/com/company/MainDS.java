package com.company;
//client testing for data structures
import com.company.DataStructure.LinkedQueue;
import com.company.DataStructure.LinkedStack;
import com.company.DataStructure.Node;
import java.util.Scanner;

public class MainDS {
    public static void main(String[] args){
        LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of operation");
        int n = sc.nextByte();
        for (int i = 0; i < n; i++){
            System.out.println("Enter the stack item: ");
            int data = sc.nextInt();
            linkedQueue.enqueue(data);
            linkedStack.push(data);
            // linkedQueue.enqueue(data);
            // linkedQueue.dequeue();
            }
        // System.out.println(linkedQueue.dequeue());
        System.out.println("Size of queue = " + linkedQueue.size());
        System.out.println("Head of queue = " + linkedQueue.getHead().getData());
        System.out.println("Tail item = " + linkedQueue.getTail().getData());
        System.out.println("Size of stack = " + linkedStack.sizeOfStack());
        System.out.println("Top of stack = " + linkedStack.peek());
        System.out.println("-----------------------------------------");
        System.out.println("Dequeued item: " + linkedQueue.dequeue());
        System.out.println("Popped item: " + linkedStack.pop());
        System.out.println("-----------------------------------------");
        System.out.println("Size of queue = " + linkedQueue.size());
        System.out.println("Head item = " + linkedQueue.getHead().getData());
        System.out.println("Tail item = " + linkedQueue.getTail().getData());
        System.out.println("Top of stack = " + linkedStack.peek());
    }
}
