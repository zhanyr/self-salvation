package io.github.zhanyr.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhanyr
 * @Create 2016-12-21 12:00 PM
 * @Desc 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 */
public class FixedThreadPool {
    private static final Logger LOGGER = LoggerFactory.getLogger(FixedThreadPool.class);

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println(Runtime.getRuntime().availableProcessors());

        //由于只有三个线程,所以每隔5s打印3个数字
        for(int i =0 ;i<10; i++){
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}