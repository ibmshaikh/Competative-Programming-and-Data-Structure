package com.ibm.cp.datastructure.LinkedList;

public class SinglyCircular {

    private Node first;
    private Node last;

    public void addLast(int val){
        Node node = new Node(val);
        if (first==null){
            first = last = node;
        }else{
            last.next = node;
            last = node;
            last.next = first;
        }

    }

    public void addFirst(int val){
        Node node = new Node(val);
        if (first==null){
            first = last = node;
        }else{
            last.next = node;
            node.next = first;
            first = node;
        }
    }

    public void deleteFirst(){
        last.next = first.next;
        first = first.next;
    }

    public boolean contains(int val) {
        Node node = first;
        if (last.value == val) {
            return true;
        }

        while (node.next != null) {
            if (node.value == val)
                return true;
            node = node.next;
        }

        return false;

    }

    public void deleteLast(){
        Node node = first;
        while (!node.next.equals(last)){
            node = node.next;
        }
        node.next = first;
        last = node;

    }

    public void show(){
        Node node = first;
        while (!node.next.equals(first)){
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(last.value);
    }

    public static class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
