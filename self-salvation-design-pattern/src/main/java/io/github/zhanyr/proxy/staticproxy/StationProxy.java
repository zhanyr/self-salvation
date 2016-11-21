package io.github.zhanyr.proxy.staticproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-11-21 7:56 PM
 * @Desc
 */
public class StationProxy implements ITicketService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StationProxy.class);

    private Station station;

    public StationProxy(Station station){
        this.station = station;
    }

    public void inquire() {
        System.out.println("您正在使用代售处问询...");
        station.inquire();
        System.out.println("再见...");

    }

    public void sellTicket() {
        System.out.println("您正在使用代售处售票...");
        station.inquire();
        System.out.println("收您五元代售费,谢谢...");
    }
}