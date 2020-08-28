package com.company;

import com.company.DataStructure.LinkedStack;
import com.company.DataStructure.Node;
import java.util.Scanner;

public class MainDS {
    public static void main(String[] args){
        LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to push");
        int n = sc.nextByte();
        for (int i = 0; i < n; i++){
            System.out.println("Enter the stack item: ");
            int data = sc.nextByte();
            linkedStack.push(data);
            }
        System.out.println("Top item = " + linkedStack.peek());
    }
}
