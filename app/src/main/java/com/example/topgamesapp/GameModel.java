package com.example.topgamesapp;

public class GameModel {
    private String gameName;
    private int gameImage;

    public GameModel(String gameName, int gameImage) {
        this.gameName = gameName;
        this.gameImage = gameImage;
    }

    public String getGameName() {
        return gameName;
    }

    public int getGameImage() {
        return gameImage;
    }
}
