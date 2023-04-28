import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    int dx = 1;
    int dy = 1;
    int SIZE = 30;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    setLocation(getX() + 1, getY() + 1);
    if (getX() <= 0 || getX() >= getWorld().getWidth() - 1) {
        dx = -dx;
    }
    if (getY() <= 0) {
        dy = -dy;
    }
    if (getY() >= getWorld().getHeight() - 1) {
        getWorld().removeObject(this);
        return;
    }
    Actor platform = getOneIntersectingObject(Platform.class);
    if (platform != null) {
        dy = -dy;
        dx += (getX() - platform.getX()) / 5;
    }
    if (platform != null) {
        // Calculate the angle of reflection
        int ballCenterX = getX() + (SIZE / 2);
        int platformCenterX = platform.getX() + (Platform.WIDTH / 2);
        int angle = (ballCenterX - platformCenterX) * 5;
        dy = -dy;
        dx = angle;
    }
    setLocation(getX() + dx, getY() + dy);
    
}
public Ball() {
    GreenfootImage ballImage = new GreenfootImage(30, 30);
    ballImage.setColor(Color.WHITE);
    ballImage.fillOval(0, 0, SIZE, SIZE);
    setImage(ballImage);
    ballImage.setColor(Color.BLACK);
    ballImage.drawOval(0, 0, SIZE-1, SIZE-1);

    dx = 5; // move 5 pixels to the right per act cycle
    dy = 5; // move 5 pixels downwards per act cycle

    // Increase the size of the ball to 30 pixels
    SIZE = 30;
    ballImage.scale(30, 30);
    setImage(ballImage);
}
}


