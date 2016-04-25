package io.github.zhanyr.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-04-25 4:38 PM
 * @Desc
 */
public class MultiThread2 implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(MultiThread2.class);

    @Override
    public void run() {
        System.out.println("runnable run....");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MultiThread2());
        thread.start();
    }
}