package com.liangbx.practice.java.time;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 基本用法：
 * 1. 创建一个Timer
 * 2. 创建一个或多个TimerTask
 * 3. 通过timer
 */
public class TimerSample {

    static class SecondTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("run");
            log();
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        SecondTask secondTask = new SecondTask();
        log();
        timer.schedule(secondTask, 0, 1000);
    }

    private static void log() {
        System.out.println(System.currentTimeMillis());
    }
}
