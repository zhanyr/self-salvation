package io.github.zhanyr.bean;


/**
 * @Author zhanyr
 * @Create 2016-03-29 10:42 PM
 * @Desc
 */
public class HelloWorld {
    private Quest quest;

    public HelloWorld(Quest quest){
        this.quest = quest;
    }

    public String hello(){
        String result = "hello,"+quest.say();
        System.out.println(result);
        return result;

    }
}