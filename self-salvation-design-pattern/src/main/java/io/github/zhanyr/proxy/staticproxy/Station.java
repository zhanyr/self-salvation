package io.github.zhanyr.proxy.staticproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-11-21 7:54 PM
 * @Desc 车站提供问询,售票服务
 */
public class Station implements ITicketService{
    private static final Logger LOGGER = LoggerFactory.getLogger(Station.class);

    public void inquire() {
        System.out.println("station, inquire...");
    }

    public void sellTicket() {
        System.out.println("station, sellTicket...");
    }
}