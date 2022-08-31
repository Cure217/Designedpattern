package com.aliano.responsibility;

public abstract class PostHandler {
    private PostHandler handler;

    public void setHandler(PostHandler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(Post post);

    public final void next(Post post){
        if(this.handler != null){
            this.handler.handleRequest(post);
        }

    }
}
