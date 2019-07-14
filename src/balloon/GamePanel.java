package balloon;

import balloon.screens.Screen;
import balloon.screens.Welcomescreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;


public class GamePanel extends JPanel implements MouseListener, Runnable {

    private Image image;
    public static Screen currentScreen;


    public GamePanel() {
        super();
        this.setFocusable(true);
        this.setPreferredSize(new Dimension(Game.WIDTH,Game.HEIGHT));
        this.addMouseListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        Resources.load();
        GamePanel.currentScreen = new Welcomescreen();
        this.image = new BufferedImage(Game.WIDTH, Game.HEIGHT, BufferedImage.TYPE_INT_RGB);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        GamePanel.currentScreen.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {


        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Graphics imageGraphics = this.image.getGraphics();
            Graphics panelGraphics = this.getGraphics();
            imageGraphics.clearRect(0,0,Game.WIDTH,Game.HEIGHT);


            GamePanel.currentScreen.draw(imageGraphics);

            imageGraphics.dispose();



            panelGraphics.drawImage(this.image, 0, 0, null);
            panelGraphics.dispose();

        }
    }
}

