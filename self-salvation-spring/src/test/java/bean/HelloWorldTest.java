package bean;

import io.github.zhanyr.bean.HelloWorld;
import io.github.zhanyr.bean.Quest;
import io.github.zhanyr.bean.QuestInstance;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhanyr
 * @Create 2016-03-29 10:47 PM
 * @Desc
 */
public class HelloWorldTest {

    @Test
    public void testHelloMock(){
        Quest quest = Mockito.mock(QuestInstance.class);
        HelloWorld helloWorld = new HelloWorld(quest);
        helloWorld.hello();
        Mockito.verify(quest,Mockito.times(1)).say();
    }

    @Test
    public void testHelloWorldIOC(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
        HelloWorld helloWorld = (HelloWorld)ac.getBean("helloWorld");
        helloWorld.hello();
    }
}