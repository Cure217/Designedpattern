package com.aliano.responsibility;

public class Test {
    public static void main(String[] args) {
        PostHandler ahandler = new AHandler();
        PostHandler bhandler = new BHandler();
        ahandler.setHandler(bhandler);
        Post post = new Post();
        post.setContent("正常内容，广告，游戏推广");
        System.out.println("过滤前的内容：" + post.getContent());
        ahandler.handleRequest(post);
        System.out.println("过滤后的内容：" + post.getContent());
    }
}
