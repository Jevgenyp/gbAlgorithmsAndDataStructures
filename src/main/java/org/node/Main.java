package org.node;


public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.print("Исходный список: ");
        linkedList.display();

        linkedList.reverse();

        System.out.print("Развернутый список: ");
        linkedList.display();
    }
}