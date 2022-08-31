package com.aliano.templatemethod;

public abstract class Cook {
    public void open(){
        System.out.println("打开油烟机");
    }
    public void fire(){
        System.out.println("开火");
    }
    public abstract void doCook();
    public void outfire(){
        System.out.println("关火");
    }
    public void close(){
        System.out.println("关闭油烟机");
    }
    public final void cook(){ // 模板方法 加final固定流程 m
        this.open();
        this.fire();
        this.doCook();
        this.outfire();
        this.close();
    }
}
