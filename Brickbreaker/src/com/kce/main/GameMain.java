
package com.kce.main;

import com.kce.bean.Game;

import com.kce.service.GameService;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        Game game = new Game();

        GameService service = new GameService(game);
        service.initialize();

        service.printGrid();
        Scanner sc = new Scanner(System.in);
        while (game.getLives() > 0) {
            System.out.println("\nEnter Command (St / Lt / Rt / Exit): ");

            String command = sc.next();
            if (command.equalsIgnoreCase("Exit"))

                break;
            service.moveBall(command);

            service.printGrid();
            System.out.println("Ball count: " + game.getLives());

        }
        System.out.println("Game Over!");

        sc.close();

    }

}

