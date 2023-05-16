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
        setLifeCount(3);
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
            dx = (ballCenterX - platformCenterX) / 12;
            dy = -dy;
        }
        showLives();
    }
    public void checkLifeCount() {
         if (this.getY() >= getWorld().getHeight() - 1) {
             lifeCount--;
             setLocation(280, 430);
             dy = -5;
         }
    }
    //public boolean isGameWon() {
        //World currentWorld = getWorld();
        //if (currentWorld.getObjects(Brick.class).isEmpty() &&
           // currentWorld.getObjects(PowerUpBlue.class).isEmpty()) {
            //return true;
        //}
        //else {
            //return false;
        //}    
    //}
    public boolean isGameLost() {
        if (lifeCount <= 0){
            return true;
        }
        else {
            return false;
        }
    }
    //public void transitionToYouWonWorld(){
        //World currentLevel = this.getWorld();
        //currentLevel.stopped();
        //World YouWonWorld1 = new YouWonWorld1();
        //YouWonWorld1.started();
        //Greenfoot.setWorld(YouWonWorld1);
    //}
    public void transitionToGameEndWorld(){
        World currentLevel = this.getWorld();
        currentLevel.stopped();
        World gameEndWorld = new gameEndWorld();
        gameEndWorld.started();
        Greenfoot.setWorld(gameEndWorld);
    }
    public void showLives() {
        getWorld().showText(""+this.getLifeCount(),80, 490);
    }
    public void setLifeCount(int lives) {
        this.lifeCount = lives;
    }
    public int getLifeCount() {
        return lifeCount;
    }
}




