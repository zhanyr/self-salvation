package io.github.zhanyr;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2017-03-14 12:33 AM
 * @Desc
 */
public class ZkWatcher implements Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZkWatcher.class);

    public void process(WatchedEvent watchedEvent) {
        System.out.println(watchedEvent);
    }
}