package io.github.zhanyr.proxy.staticproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-11-21 8:01 PM
 * @Desc
 */
public class StationProxyTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StationProxyTest.class);

    public static void main(String[] args) {
        StationProxy stationProxy = new StationProxy(new Station());

        stationProxy.inquire();

        stationProxy.sellTicket();
    }
}