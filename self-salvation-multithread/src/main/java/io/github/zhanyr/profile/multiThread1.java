package io.github.zhanyr.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-04-21 4:27 PM
 * @Desc
 */
public class MultiThread1 extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(MultiThread1.class);

    public static void main(String[] args) {
        Thread thread = new MultiThread1();
        thread.start();
    }

    @Override
    public void run(){
        System.out.println("thread run...");
    }
}