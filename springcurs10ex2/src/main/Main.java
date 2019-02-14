package main;

import subject.MySubject;

public class Main {

    public static void main(String[] args) {
        MySubject s = new MySubject();

        s.addMyListener(() -> System.out.println("A"));
        s.addMyListener(() -> System.out.println("B"));
        s.addMyListener(() -> System.out.println("C"));

        s.action();
    }
}
