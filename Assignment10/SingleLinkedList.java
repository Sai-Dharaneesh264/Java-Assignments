package com.java.Assignments.Assignment10;

public class SingleLinkedList {
    public static void main(String[] args) {
        SList list = new SList();
        SListIterator sListIterator = list.iterator();
        for (int i = 10; i <= 20; i++) {
            sListIterator.append(i);
        }
        sListIterator.display();
        sListIterator.remove();
        sListIterator.display();
//        sListIterator.remove();
        System.out.println(sListIterator.size());
    }
}
