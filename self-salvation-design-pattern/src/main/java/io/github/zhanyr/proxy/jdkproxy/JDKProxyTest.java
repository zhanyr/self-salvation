package io.github.zhanyr.proxy.jdkproxy;

import org.mockito.cglib.proxy.Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-11-21 8:28 PM
 * @Desc
 */
public class JDKProxyTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(JDKProxyTest.class);

    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();

        ClassLoader classLoader = car.getClass().getClassLoader();

        Class<?>[] interfaces = car.getClass().getInterfaces();

        InvocationHandlerImpl invocationHandler = new InvocationHandlerImpl(car);

        Object o = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        Vehicle vehicle = (Vehicle)o;
        vehicle.drive();

        Rechargeable rechargeable = (Rechargeable)o;
        rechargeable.recharge();

        ProxyUtils.generateClassFile(car.getClass(), "EProxy");


    }
}