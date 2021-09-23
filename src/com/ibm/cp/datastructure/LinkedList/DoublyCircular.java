package com.ibm.cp.datastructure.LinkedList;

public class DoublyCircular {

    private Node first;
    private Node last;


    public void addLast(int value) {
        Node node = new Node(value);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            node.prev = last;
            node.next = first;
            last = node;
        }
    }

    public void deleteFirst(){
        last.next = first.next;
        first = first.next;
        first.prev = last;
    }

    public void deleteLast(){
        first.prev = last.prev;
        last = last.prev;
        last.next = first;
    }

    public boolean contains(int val) {
        Node node = first;
        if (last.value == val) {
            return true;
        }

        while (!node.next.equals(first)) {
            if (node.value == val)
                return true;
            node = node.next;
        }

        return false;

    }

    public void addFirst(int value){
        Node node = new Node(value);

        first.prev = node;
        last.next = node;
        node.prev = last;
        node.next = first;
        first = node;
    }

    public void show(){
        Node node = first;
        while(node.next!=first){
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(last.value);
    }


    private class Node {
        private Node prev;
        private Node next;
        private int value;

        private Node(int value) {
            this.value = value;
        }
    }
}
