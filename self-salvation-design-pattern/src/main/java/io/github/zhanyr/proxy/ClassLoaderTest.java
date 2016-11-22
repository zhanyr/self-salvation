package io.github.zhanyr.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * @Author zhanyr
 * @Create 2016-11-21 5:55 PM
 * @Desc
 */
public class ClassLoaderTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClassLoaderTest.class);

    public static void main(String[] args) throws Exception{
        String currentPath = ClassLoaderTest.class.getResource("/").getPath()+"io/github/zhanyr/proxy";
        Path path = Paths.get(currentPath, "Programmer.class");

        InputStream inputStream = Files.newInputStream(path);

        byte[] result = new byte[1024];
        int count = inputStream.read(result);

        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> clazz = myClassLoader.defineMyClass(null, result, 0, count);

        Object o = clazz.newInstance();

        
        clazz.getMethod("code", null).invoke(o, null);


    }
}