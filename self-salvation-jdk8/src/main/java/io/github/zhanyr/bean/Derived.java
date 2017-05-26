package io.github.zhanyr.bean;

/**
 * @Author zhanyr
 * @Create 2017-04-01 5:44 PM
 * @Desc
 */
class Base {
    private int i = 2;

    public Base() {
        System.out.println(i);
        System.out.println(this.i);
        this.display();
        System.out.println(this.i);
        System.out.println("Base: " + this.getClass());
    }

    public void display() {
        System.out.println("Base…" + i);
    }
}

public class Derived extends Base {
    public int i = 22;

    public Derived() {
        i = 222;
        System.out.println("Derived: " + this.getClass());
    }

    public void display() {
        System.out.println("Derived…" + i);
    }

    public static void main(String[] args){
        new Derived();
    }

}