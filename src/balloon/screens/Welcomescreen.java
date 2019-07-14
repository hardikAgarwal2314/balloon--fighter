package balloon.screens;

import balloon.Game;
import balloon.GamePanel;
import balloon.Resources;

import java.awt.*;
import java.awt.event.MouseEvent;


public class Welcomescreen extends Screen {

    @Override
    public void mousePressed(MouseEvent event) {

         int startbuttonx=400;
         int startbuttony=220;

         if (event.getX() >startbuttonx && event.getX() < startbuttonx+200 && event.getY() >startbuttony && event.getY() < startbuttony+80) {
            GamePanel.currentScreen = new Mainscreen();
        }
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawImage(Resources.getSTARTImage(),0,0,Game.WIDTH,Game.HEIGHT,null);
    }
}
