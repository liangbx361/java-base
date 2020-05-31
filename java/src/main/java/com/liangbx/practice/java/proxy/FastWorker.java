package com.liangbx.practice.java.proxy;

public class FastWorker implements Worker {

    @Override
    public void work() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
