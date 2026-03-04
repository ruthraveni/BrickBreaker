package com.kce.bean;

public class Game {
    private final int SIZE = 7;

    private String[][] grid;

    private int lives;

    public Game() {

        grid = new String[SIZE][SIZE];

        lives = 5;

    }

    public int getSIZE() {

        return SIZE;

    }

    public String[][] getGrid() {

        return grid;

    }

    public int getLives() {

        return lives;

    }

    public void decreaseLife() {

        lives--;

    }
}






















