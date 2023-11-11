package jponger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    static JFrame f = new JFrame("pong");

    public static void main(String[] args) {
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(650,495);

        PongGame game = new PongGame();
        f.add(game);

        f.setVisible(true);

        Timer timer = new Timer(30, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                game.gameLogic();
                game.repaint();
            }
        });
        timer.start();
    } 
}
