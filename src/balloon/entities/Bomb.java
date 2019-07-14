package balloon.entities;


import balloon.Cordinates;
import balloon.Game;
import balloon.Resources;




public class Bomb extends Entity {
    private static final int BOMBWIDTH=128;
    private static final int BOMBHEIGHT=128;
    private static final int BOMBYVEL=-10;
    private static final int NEWCORDINATE=700;


    public Bomb(int x, int y)
    {
        super(x, y, BOMBWIDTH, BOMBHEIGHT);
        this.image = Resources.getBombImage();
        this.setyVel(BOMBYVEL);
    }

    @Override
    public void update() {
        super.update();

        if (this.getY () < -BOMBHEIGHT) {
            this.setY (NEWCORDINATE) ;
            this.isvisible = false;
            this.setX (Cordinates.randomInt(0, Game.WIDTH-BOMBWIDTH));
        }
    }
}

