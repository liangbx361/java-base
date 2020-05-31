package com.liangbx.practice.java.proxy;

public class SlowWorker implements Worker{

    @Override
    public void work() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
