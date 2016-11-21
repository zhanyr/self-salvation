package io.github.zhanyr.proxy.jdkproxy;

import org.mockito.cglib.proxy.InvocationHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @Author zhanyr
 * @Create 2016-11-21 8:25 PM
 * @Desc
 */
public class InvocationHandlerImpl implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(InvocationHandlerImpl.class);

    private ElectricCar car;

    public InvocationHandlerImpl(ElectricCar car){
        this.car = car;
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("You are going to invoke " + method.getName() + "...");
        method.invoke(car, null);
        System.out.println(method.getName() + " invocation finished...");
        return null;
    }
}