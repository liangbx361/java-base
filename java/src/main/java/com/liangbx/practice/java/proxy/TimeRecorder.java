package com.liangbx.practice.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeRecorder implements InvocationHandler {

    private Object object;

    public TimeRecorder(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(object, args);
        long endTime = System.currentTimeMillis();
        System.out.println(method.getName() + "耗时：" + (endTime - startTime));
        return result;
    }
}
