package com.ibm.cp.datastructure.LinkedList;

public class Singly {

    private Node first;
    private Node last;

    private int count =0;

    public void addLast(int val) {
        Node node = new Node(val);
        node.next = null;
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        count++;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = null;

        if (first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        count++;

    }

    public void deleteFirst() {
        first = first.next;
        count--;

    }

    public int size(){
        return count;
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

    public void deleteLast() {
        Node node = first;
        while (!node.next.equals(last)) {
            node = node.next;
        }
        node.next = null;
        last = node;
        count--;

    }

    public void show() {
        Node node = first;
        while (node.next != null) {
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(node.value);
    }

    public static class Node {

        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
