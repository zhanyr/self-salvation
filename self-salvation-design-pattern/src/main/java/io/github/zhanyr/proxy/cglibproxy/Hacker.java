package io.github.zhanyr.proxy.cglibproxy;

import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @Author zhanyr
 * @Create 2016-11-21 9:00 PM
 * @Desc
 */
public class Hacker implements MethodInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Hacker.class);

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("I am hacker, Let's see what the poor programmer is doing Now...");
        methodProxy.invokeSuper(o, objects);
        System.out.println("hehe...");
        return null;
    }
}