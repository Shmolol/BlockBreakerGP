import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameEndWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameEndWorld extends World
{

    public GreenfootSound gameOverSound;
    
    /**
     * Constructor for objects of class gameEndWorld.
     * 
     */
    public gameEndWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 510, 1); 
        showTextWithEdit("Game Over", getWidth() / 5, getHeight() / 2);
        showText("Press ESC to return to main menu", 270, 430);
        gameOverSound = new GreenfootSound("GameOver (1).wav");
        //started();
        //checkGameOver();
    }
    public void act() {
        if (Greenfoot.isKeyDown("escape")) {
            transitionToMainScreen();
        }
    }
    public void transitionToMainScreen(){
        stopped();
        Greenfoot.stop();
        World MainScreen = new MainScreen();
        Greenfoot.setWorld(MainScreen);
        MainScreen.started();
        Greenfoot.start();
    }
    public void showTextWithEdit(String message, int x, int y) {
        GreenfootImage bg = getBackground();
        Font font = new Font(60);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message,x,y);
    }
    private void checkGameOver() {
        showText("Game Over", getWidth() / 2, getHeight() / 2);
    }
    public void started(){
        gameOverSound.play();
    }
    public void stopped(){
        gameOverSound.stop();
    }
}


