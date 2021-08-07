package com.liangbx.practice.java.thread;

public class SynchronizedSample {

    public static class A {

        public synchronized void m1() {
            System.out.println("m1");
        }

        public synchronized void m2() {
            System.out.println("m1");
        }
    }

    public static void main(String[] args) {
        A a = new A();

        for(int i=0; i<10; i++) {

        }
    }
}
