package balloon.screens;

import java.awt.*;
import java.awt.event.MouseEvent;


public abstract class Screen {

    public abstract void mousePressed(MouseEvent event);

    public abstract void draw(Graphics graphics);
}