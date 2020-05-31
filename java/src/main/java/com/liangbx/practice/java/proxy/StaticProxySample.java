package com.liangbx.practice.java.proxy;

public class StaticProxySample {

    public static void main(String[] args) {
        TimeRecorderProxy timeRecorderProxy = new TimeRecorderProxy(new FastWorker());
        timeRecorderProxy.work();
    }

    static class TimeRecorderProxy implements Worker {

        private Worker worker;

        public TimeRecorderProxy(Worker worker) {
            this.worker = worker;
        }

        @Override
        public void work() {
            long startTime = System.currentTimeMillis();
            worker.work();
            long endTime = System.currentTimeMillis();
            System.out.println("work 耗时：" + (endTime - startTime));
        }
    }
}
