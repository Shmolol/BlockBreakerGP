import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor {
    private int dx = 5;
    private int dy = 5;
    private int SIZE = 30;

    public Ball() {
        GreenfootImage ballImage = new GreenfootImage(SIZE, SIZE);
        ballImage.setColor(Color.WHITE);
        ballImage.fillOval(0, 0, SIZE, SIZE);
        setImage(ballImage);
        ballImage.setColor(Color.BLACK);
        ballImage.drawOval(0, 0, SIZE-1, SIZE-1);
    }

    public void act() {
        setLocation(getX() + dx, getY() + dy);
        checkCollision();
    }

    private void checkCollision() {
        Actor brick = getOneIntersectingObject(Brick.class);
        if (brick != null) {
            getWorld().removeObject(brick);
            dy = -dy;
        }
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1) {
            dx = -dx;
        }
        if (getY() <= 0) {
            dy = -dy;
        }
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
        Actor platform = getOneIntersectingObject(Platform.class);
        if (platform != null) {
            int platformCenterX = platform.getX() + (Platform.WIDTH / 2);
            int ballCenterX = getX() + (SIZE / 2);
            dx = (ballCenterX - platformCenterX) / 5;
            dy = -dy;
        }
    }
}



