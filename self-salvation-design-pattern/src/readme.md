参考
http://blog.csdn.net/luanlouis/article/details/24589193

JDK中提供的生成动态代理类的机制有个鲜明的特点是： 
某个类必须有实现的接口，而生成的代理类也只能代理某个类接口定义的方法，
比如：如果上面例子的ElectricCar实现了继承自两个接口的方法外，另外实现了方法bee(),
则在产生的动态代理类中不会有这个方法了！更极端的情况是：如果某个类没有实现接口，那么这个类就不能同JDK产生动态代理了！