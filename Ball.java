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
    public static int lifeCount;
    public Ball() {
        //GreenfootImage ballImage = new GreenfootImage(SIZE, SIZE);
        //ballImage.setColor(Color.WHITE);
        //ballImage.fillOval(0, 0, SIZE, SIZE);
        //setImage(ballImage);
        //ballImage.setColor(Color.BLACK);
        //ballImage.drawOval(0, 0, SIZE-1, SIZE-1);
        lifeCount = 3;
    }
    public Ball(int x, int y) {
        setLocation(x,y);
    }
    public void act() {
        setLocation(getX() + dx, getY() + dy);
        checkCollision();
        if(isGameLost()){
            transitionToGameEndWorld();    
        }
    }

    private void checkCollision() {
        Actor brick = getOneIntersectingObject(Brick.class);
        Actor powerUpBlue = getOneIntersectingObject(PowerUpBlue.class);
        if (brick != null) {
            getWorld().removeObject(brick);
            //getWorld().removeObject(powerUpBlue);
            dy = -dy;
            Greenfoot.playSound("pop1.wav");
        }
        if (powerUpBlue != null) {
            getWorld().removeObject(powerUpBlue);
            dy = -dy;
            Greenfoot.playSound("pop1.wav");
        }
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1) {
            dx = -dx;
        }
        if (getY() <= 0) {
            dy = -dy;
        }
        checkLifeCount();
        Actor platform = getOneIntersectingObject(Platform.class);
        if (platform != null) {
            int platformCenterX = platform.getX() + (Platform.WIDTH / 2);
            int ballCenterX = getX() + (SIZE / 2);
            dx = (ballCenterX - platformCenterX) / 5;
            dy = -dy;
        }
    }
    public void checkLifeCount() {
         if (this.getY() >= getWorld().getHeight() - 1) {
             lifeCount--;
             setLocation(280, 430);
             dy = -5;
         }
    }
    public static boolean isGameLost() {
        if (lifeCount <= 0){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void transitionToGameEndWorld(){
        World currentLevel = this.getWorld();
        currentLevel.stopped();
        World gameEndWorld = new gameEndWorld();
        gameEndWorld.started();
        Greenfoot.setWorld(gameEndWorld);
    }
}




