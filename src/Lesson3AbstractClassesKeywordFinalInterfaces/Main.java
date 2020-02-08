package Lesson3AbstractClassesKeywordFinalInterfaces;

public class Main {
    public static void main(String[] args) {
        IntList intLinkedList = new IntLinkedList();
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(4);

        System.out.println(intLinkedList.get(0));
        System.out.println(intLinkedList.get(4));
        System.out.println(intLinkedList.get(2));
        System.out.println(intLinkedList.size());

        System.out.println(intLinkedList);

//        for (String s : intLinkedList){
//
//        }

    }
}
