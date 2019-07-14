package balloon;

import javax.swing.*;

public class Game {


    public static final int WIDTH = 900;
    public static final int HEIGHT = 550;


    private static GamePanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new GamePanel();

        frame.add(Game.panel);
        frame.pack();
        frame.setVisible(true);
    }

}