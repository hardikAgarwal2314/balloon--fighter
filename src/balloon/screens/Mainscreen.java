package balloon.screens;

import balloon.Game;
import balloon.GamePanel;
import balloon.Resources;
import balloon.entities.Balloon;
import balloon.entities.Bomb;
import balloon.entities.Entity;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;


public class Mainscreen extends Screen {

    private List<Entity> elements;
    private int score = 0;

    int a[] = new int[4];

    public Mainscreen() {
        super();

        System.out.println(this.a.length);
        this.elements = new ArrayList();
        this.elements.add(new Balloon(10, 800));
        this.elements.add(new Balloon(100, 600));
        this.elements.add(new Balloon(150, 900));
        this.elements.add(new Balloon(300, 1000));
        this.elements.add(new Balloon(400, 950));
        this.elements.add(new Balloon(600, 770));
        this.elements.add(new Balloon(800, 660));
        this.elements.add(new Balloon(20, 1200));
        this.elements.add(new Bomb(20, 1100));
        this.elements.add(new Bomb(450, 400));
        this.elements.add(new Bomb(300, 800));
        this.elements.add(new Bomb(600, 950));
        this.elements.add(new Bomb(750, 770));
    }

    @Override
    public void mousePressed(MouseEvent event) {
        for (Entity element: this.elements) {
            if(element.Clickclash(event.getX(), event.getY())) {

                element.isvisible = true;
                Resources.getBurstAudio().play();

                if(element instanceof Balloon) {
                    this.score += 10;
                } else if(element instanceof Bomb) {
                    GamePanel.currentScreen = new Gameoverscreen();
                }
            }
        }
    }

    @Override
    public void draw(Graphics graphics) {

        graphics.setColor(Color.black);
        graphics.fillRect(0,0,Game.WIDTH,Game.HEIGHT);
        graphics.setColor(Color.white);
        graphics.setFont(new Font("Arial", Font.BOLD, 30));
        graphics.drawString("SCORE=" + (this.score), 700, 30);

        for (Entity element: this.elements) {
            element.update();
            if(!element.isvisible) {
                graphics.drawImage(element.image, element.getX(), element.getY(), null);
            }
        }
    }
}
