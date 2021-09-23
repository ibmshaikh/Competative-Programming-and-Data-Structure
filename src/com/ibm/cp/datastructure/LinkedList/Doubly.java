package com.ibm.cp.datastructure.LinkedList;

public class Doubly {

    private Node first;
    private Node last;
    private int count = 0;

    public void addLast(int value) {
        Node node = new Node(value);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        count++;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (first == null) {
            first = last = node;
        } else {
            first.prev = node;
            node.next = first;
            first = node;
        }
        count++;

    }

    public void deleteFirst() {
        first = first.next;
        first.prev = null;
        count--;

    }

    public void deleteLast() {
        last = last.prev;
        last.next = null;
        count--;

    }

    public int size() {
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

    public void show() {
        Node node = first;
        while (node.next != null) {
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(last.value);
    }


    public static class Node {
        public int value;
        public Node next;
        public Node prev;

        public Node(int value) {
            this.value = value;
        }
    }
}
