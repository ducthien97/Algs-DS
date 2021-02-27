package com.company.DataStructure;
//An implementation of stack as a linked list

public class LinkedStack <Item>{
    private int n = 0; //size of stack
    private Node<Item> topItem;
    private Node<Item> bottomItem;
    public int sizeOfStack(){
        return n;
    }

    public boolean isEmpty(){
        return (this.n == 0);
    }

    public void push(Item item){
        if (isEmpty()){
            topItem = new Node<>();
            bottomItem = new Node<>();
            bottomItem.setData(item);
            topItem.setData(item);
            topItem.setNext(null);
        }
        else{
            Node oldFirst = topItem;
             // oldFirst = topItem;
            topItem = new Node<>();
            topItem.setNext(oldFirst);
            topItem.setData(item);
        }
        n++;
    }
    public Item pop(){
        Item popped = this.topItem.getData();
        topItem.setData(null);
        topItem = topItem.getNext();
        n--;
        return popped;
    }
    public Item peek(){
        return topItem.getData();
    }
    public Item peekBottom() {
        return  bottomItem.getData();
    }
}
