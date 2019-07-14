package balloon.screens;
import balloon.Game;
import balloon.GamePanel;
import balloon.Resources;

import java.awt.*;
import java.awt.event.MouseEvent;


public class Gameoverscreen extends Screen {
    @Override
    public void mousePressed(MouseEvent event)
    {

        GamePanel.currentScreen = new Welcomescreen();
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawImage(Resources.getGameOverImage(), 0, 0, Game.WIDTH, Game.HEIGHT, null);
    }
}

