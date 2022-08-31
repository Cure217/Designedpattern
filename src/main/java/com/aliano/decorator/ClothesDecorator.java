package com.aliano.decorator;

//装饰器要和被装饰对象实现同一个接口
public abstract class ClothesDecorator implements Person {
    //装饰器中要使用被装饰的对象
    protected Person person;//被装饰的对象 即小明

    public ClothesDecorator(Person person) {
        this.person = person;
    }
}
