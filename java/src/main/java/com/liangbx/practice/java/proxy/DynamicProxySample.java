package com.liangbx.practice.java.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxySample {

    public static void main(String[] args) {
        FastWorker target = new FastWorker();
        TimeRecorder timeRecorder = new TimeRecorder(new SlowWorker());
        Worker worker = (Worker) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), timeRecorder);
        worker.work();
    }
}
