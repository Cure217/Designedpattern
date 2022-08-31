package com.aliano.adapter;

public class PlayerAdapter implements MusicPlayer{

    private Myplayer player;

    public PlayerAdapter() {
        this.player = new Myplayer(); // 提前创建好无需参数
    }

    @Override
    public void play(String type, String filename) {
        if(type.equals("mp3")) this.player.playMp3(filename);
        if(type.equals("wma")) this.player.playWma(filename);
    }
}
