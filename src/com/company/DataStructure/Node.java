package com.company.DataStructure;
//representation of LinkedList (encapsulated version)
public class Node<Item> {
    private Item data;
    private Node next;

    public void setData(Item data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Item getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
