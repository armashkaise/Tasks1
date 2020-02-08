package Lesson3AbstractClassesKeywordFinalInterfaces;

import java.util.ArrayList;
import java.util.Objects;

public class IntLinkedList implements IntList{
    private Node head;
    private int size;


    public void add(int value) {
        Node newNode = new Node(value);
        if (Objects.isNull(head))
            head = newNode;
        else {
            Node last = head;
            while (!Objects.isNull(last.next)) {
                last = head.next;
            }
            last.next = newNode;
        }
        size++;

    }

    public int get(int index) {
        if (size-1 < index || index < 0) return -1;
        if (index == 0) return head.value;
        Node last = head;
        for (int i = 1; i <= index; i++) {
            last = last.next;
        }
        return last.value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {

        ArrayList arrayList = new ArrayList();

        
        Node last = head;
        for (int i = 0; i < size; i++) {
            arrayList.add(last.value);
            last = last.next;
        }

        return arrayList;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;

        }
    }
}
