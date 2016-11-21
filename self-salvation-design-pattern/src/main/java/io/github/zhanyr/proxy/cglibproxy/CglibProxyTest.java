package io.github.zhanyr.proxy.cglibproxy;

import io.github.zhanyr.proxy.jdkproxy.ProxyUtils;
import org.mockito.cglib.proxy.Enhancer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-11-21 9:02 PM
 * @Desc
 */
public class CglibProxyTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CglibProxyTest.class);

    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        Hacker hacker = new Hacker();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(programmer.getClass());

        enhancer.setCallback(hacker);

        Programmer proxy = (Programmer)enhancer.create();

        proxy.code();

        ProxyUtils.generateClassFile(Programmer.class, "PGProxy");
    }
}