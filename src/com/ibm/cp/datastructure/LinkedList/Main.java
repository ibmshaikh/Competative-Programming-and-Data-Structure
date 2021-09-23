package com.ibm.cp.datastructure.LinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Single LinkedList

        /*Singly singly = new Singly();
        singly.addLast(2);

        singly.addLast(4);
        singly.addLast(5);
        singly.addLast(6);

        singly.addFirst(1);
        singly.addFirst(0);
        singly.deleteLast();

        System.out.println(singly.contains(5));
        singly.show();*/



        //Double LinkedList
        /*Doubly doubly = new Doubly();
        doubly.addLast(5);
        doubly.addLast(6);
        doubly.addLast(7);

        doubly.addFirst(4);
        doubly.addFirst(3);
        doubly.addLast(8);
        doubly.deleteFirst();
        doubly.deleteLast();

        doubly.addLast(10);

        System.out.println(doubly.contains(10));
        doubly.show();

        System.out.println(doubly.size());*/


        //SinglyCircular
        /*SinglyCircular singlyCircular = new SinglyCircular();
        singlyCircular.addLast(5);
        singlyCircular.addLast(6);
        singlyCircular.addLast(7);
        singlyCircular.addFirst(4);
        singlyCircular.deleteLast();
        singlyCircular.deleteFirst();
        singlyCircular.show();*/



        //Double Circular LinkedList
        DoublyCircular doublyCircular = new DoublyCircular();
        doublyCircular.addLast(5);
        doublyCircular.addLast(6);
        doublyCircular.addLast(7);
        doublyCircular.addLast(8);
        doublyCircular.addFirst(4);
        doublyCircular.addFirst(3);
        doublyCircular.addLast(9);

        doublyCircular.deleteFirst();
        doublyCircular.deleteLast();
        doublyCircular.deleteLast();
        doublyCircular.deleteFirst();
        System.out.println(doublyCircular.contains(3));

        doublyCircular.show();

    }
}
