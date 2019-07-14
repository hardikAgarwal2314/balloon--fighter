package balloon.entities;

import java.awt.Image;


abstract public class Entity {

    public void setX(int x) {
        this.x = x;
    }

    private int x;

    public void setY(int y) {
        this.y = y;
    }

    private int y;
    private int xVel = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int yVel= 0;
    private int xAcc = 0;
    private int yAcc = 0;
    private int width;
    private int height;
    public boolean isvisible = false;

    public Image image;

    public void setyVel(int yVel) {
        this.yVel = yVel;
    }

    public Entity(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void update() {
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
        this.x += this.xVel;
        this.y += this.yVel;
    }

    public boolean Clickclash(int x, int y) {
        if(!this.isvisible)
        {
            if ((x > this.x) && x < (this.x + this.width) && (y > this.y )&& y < (this.y + this.height))
            {
                return true;
            }
        }

        return false;
    }
}

