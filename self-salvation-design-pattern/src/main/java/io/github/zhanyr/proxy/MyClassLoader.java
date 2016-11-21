package io.github.zhanyr.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zhanyr
 * @Create 2016-11-21 5:44 PM
 * @Desc
 */
public class MyClassLoader extends ClassLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyClassLoader.class);

    public Class<?> defineMyClass(String name, byte[] b, int off, int len){
        return super.defineClass(name, b, off, len);
    }
}