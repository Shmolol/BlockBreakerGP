import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameEndWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameEndWorld extends World
{

    /**
     * Constructor for objects of class gameEndWorld.
     * 
     */
    public gameEndWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 510, 1); 
        checkGameOver();
    }

    private void checkGameOver() {
        //int lives = 3;
        //if (getObjects(Brick.class).isEmpty()) {
        //showText("You Win!", getWidth() / 2, getHeight() / 2);
        //Greenfoot.stop();
        if (Ball.isGameLost()){
            showText("Game Over", getWidth() / 2, getHeight() / 2);
        }
        //if (getObjects(Ball.class).isEmpty()) {
        //lives--;
        //if (lives > 0) {
        //    showText("Lives: " + lives, getWidth() - 50, getHeight() - 20);
        //    addObject(new Ball(), getWidth() / 2, getHeight() / 2);
        //} else {
        //    showText("Game Over", getWidth() / 2, getHeight() / 2);
        //    Greenfoot.stop();
        //}
        //}
        //}
    }
}


