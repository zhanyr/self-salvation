package io.github.zhanyr.proxy.jdkproxy;

/**
 * @Author zhanyr
 * @Create 2016-11-21 8:23 PM
 * @Desc
 */
public class ElectricCar implements Rechargeable, Vehicle{

    public void recharge() {
        System.out.println("Rechargeable recharge...");
    }

    public void drive() {
        System.out.println("Vehicle drive...");
    }
}
