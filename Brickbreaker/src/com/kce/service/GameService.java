package com.kce.service;

import com.kce.bean.Game;

public class GameService {

    private Game game;

    private int ballCol = 3;   
    public GameService(Game game) {

        this.game = game;

    }

    public void initialize() {
        String[][] grid = game.getGrid();

        int SIZE = game.getSIZE();
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                if (i == 0 || i == SIZE - 1 || j == 0 || j == SIZE - 1)

                    grid[i][j] = "w";

                else

                    grid[i][j] = " ";

            }

        }

        for (int j = 1; j < SIZE - 1; j++)

            grid[6][j] = "g";
 

        ballCol = 3;

        grid[6][ballCol] = "o";
   

        int[][] bricks = {

                {2,2},{2,3},{2,4},

                {3,2},{3,3},{3,4}

        };

        for (int[] b : bricks)

            grid[b[0]][b[1]] = "1";

    }

    public void moveBall(String direction) {

        String[][] grid = game.getGrid();

        grid[6][ballCol] = "g";
 

        if (direction.equalsIgnoreCase("St")) {
            grid[6][ballCol] = "o";

            return;

        }
        if (direction.equalsIgnoreCase("Lt")) {
            if (grid[3][4].equals("1")) {

                grid[3][4] = " ";

                game.decreaseLife();

            }

            ballCol = ballCol - 1;  

            grid[6][ballCol] = "o";

            return;

        }

        if (direction.equalsIgnoreCase("Rt")) {
            if (grid[3][2].equals("1")) {

                grid[3][2] = " ";

                game.decreaseLife();

            }
            ballCol = ballCol + 1;  

            grid[6][ballCol] = "o";

        }

    }

    public void printGrid() {

        String[][] grid = game.getGrid();

        int SIZE = game.getSIZE();
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                System.out.print(grid[i][j] + " ");

            }

            System.out.println();

        }

    }

}