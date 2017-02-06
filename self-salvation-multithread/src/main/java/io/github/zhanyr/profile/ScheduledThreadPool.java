package io.github.zhanyr.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhanyr
 * @Create 2016-12-21 2:58 PM
 * @Desc 创建一个定长线程池，支持定时及周期性任务执行
 */
public class ScheduledThreadPool {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledThreadPool.class);

    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(8);

        //延迟5s
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 5 secs");
            }
        }, 5, TimeUnit.SECONDS);


        //延迟1s, 每5s执行一次
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 1 secs, execute per 5 secs");
            }
        }, 1, 5, TimeUnit.SECONDS);

    }
}