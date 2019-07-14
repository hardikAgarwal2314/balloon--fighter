package balloon.entities;

import balloon.Cordinates;
import balloon.Game;
import balloon.Resources;

public class Balloon extends Entity{



    private static final int BALLOONWIDTH = 128;
    private static final int BALLOONHEIGHT = 128;
    private static final int BALLOONYVEL=-10;
    private static final int NEWCORDINATE=800;

    public Balloon(int x, int y)
    {
        super(x, y, BALLOONWIDTH , BALLOONHEIGHT);
        this.image = Resources.getBalloonImage();
        this.setyVel(BALLOONYVEL);
    }

    @Override
    public void update() {
        super.update();

        if (this.getY () < -BALLOONHEIGHT)
        {
            this.setY (NEWCORDINATE);
            this.isvisible = false;
            this.setX (Cordinates.randomInt(0, Game.WIDTH-BALLOONWIDTH));
        }
    }
}

