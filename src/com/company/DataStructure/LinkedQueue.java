package com.company.DataStructure;
// Queue implementation using LinkedList
public class LinkedQueue<Item> {
    private Node<Item> tail;
    private Node<Item> head;
    private int n = 0;

    public void enqueue(Item item){
        if (n == 0){
            Node<Item> newNode = new Node<Item>();
            newNode.setData(item);
            newNode.setNext(null);
            head = newNode;
            tail = head;
            n++;
        }
        else {
            Node<Item> oldTail = tail;
            tail = new Node<Item>();
            tail.setData(item);
            oldTail.setNext(tail);
            n++;
        }
    }

    public Item dequeue(){
        if (isEmpty()){
            System.out.println("Can't dequeue an empty queue");
            return null;
        }
        else if (n == 1){
            Item popped = head.getData();
            head = null;
            tail = null;
            n--;
            return popped;
        }
        else{
            Item popped = (Item) head.getData();
            head = head.getNext();
            n--;
            return popped;
        }
    }

    public int size(){
        return this.n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public Node<Item> getHead() {
        return head;
    }

    public Node<Item> getTail() {
        return tail;
    }

}
