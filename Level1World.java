import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1World extends World
{

    /**
     * Constructor for objects of class Level1World.
     * 
     */
    public Level1World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 510, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,270,475);
        Ball ball = new Ball();
        addObject(ball,292,401);
        ball.setLocation(287,402);
        Ball ball2 = new Ball();
        addObject(ball2,287,402);
        ball.setLocation(254,422);
        ball.setLocation(291,400);
        removeObject(ball);
        ball2.setLocation(274,424);
        PowerUpBlue powerUpBlue = new PowerUpBlue();
        addObject(powerUpBlue,99,68);
        Brick brick = new Brick();
        addObject(brick,209,67);
        powerUpBlue.setLocation(68,67);
        powerUpBlue.setLocation(76,131);
        powerUpBlue.setLocation(69,63);
        brick.setLocation(52,119);
        powerUpBlue.setLocation(197,70);
        brick.setLocation(101,117);
        brick.setLocation(91,128);
        Brick brick2 = new Brick();
        addObject(brick2,176,122);
        Brick brick3 = new Brick();
        addObject(brick3,294,123);
        Brick brick4 = new Brick();
        addObject(brick4,409,122);
        Brick brick5 = new Brick();
        addObject(brick5,515,123);
        brick.setLocation(43,124);
        brick2.setLocation(139,123);
        brick3.setLocation(265,122);
        brick4.setLocation(376,119);
        brick5.setLocation(475,119);
        brick4.setLocation(421,117);
        brick3.setLocation(301,117);
        powerUpBlue.setLocation(150,83);
        PowerUpBlue powerUpBlue2 = new PowerUpBlue();
        addObject(powerUpBlue2,389,80);
        Brick brick6 = new Brick();
        addObject(brick6,274,80);
        Brick brick7 = new Brick();
        addObject(brick7,500,77);
        Brick brick8 = new Brick();
        addObject(brick8,53,78);
        Brick brick9 = new Brick();
        addObject(brick9,52,34);
        Brick brick10 = new Brick();
        addObject(brick10,165,31);
        brick10.setLocation(171,37);
        Brick brick11 = new Brick();
        addObject(brick11,274,37);
        Brick brick12 = new Brick();
        addObject(brick12,390,36);
        Brick brick13 = new Brick();
        addObject(brick13,502,36);
        brick7.setLocation(505,78);
        brick4.setLocation(387,120);
        Brick brick14 = new Brick();
        addObject(brick14,114,164);
        Brick brick15 = new Brick();
        addObject(brick15,337,165);
        brick3.setLocation(264,123);
        brick6.setLocation(262,76);
        brick11.setLocation(253,38);
        brick12.setLocation(369,38);
        powerUpBlue2.setLocation(368,71);
        brick4.setLocation(370,115);
        brick15.setLocation(336,158);
        brick14.setLocation(125,163);
        Brick brick16 = new Brick();
        addObject(brick16,451,167);
        brick15.setLocation(313,164);
        removeObject(brick15);
        brick16.setLocation(424,169);

        addObject(brick15,271,200);
        brick5.setLocation(487,122);
        brick4.setLocation(409,122);
        powerUpBlue2.setLocation(405,83);
        brick12.setLocation(396,42);
        brick11.setLocation(302,38);
        ball2.setLocation(290,426);
        ball2.setLocation(281,426);
        brick6.setLocation(280,80);
        brick3.setLocation(279,129);
        brick4.setLocation(373,126);
        powerUpBlue2.setLocation(375,77);
        brick12.setLocation(377,47);
        powerUpBlue.setLocation(171,82);
        brick2.setLocation(176,127);
        brick.setLocation(89,117);
        powerUpBlue.setLocation(157,76);
        brick10.setLocation(146,44);
        brick16.setLocation(444,158);
        brick15.setLocation(283,200);
        brick14.setLocation(55,176);
        brick.setLocation(35,143);
        brick10.setLocation(166,39);
        powerUpBlue.setLocation(171,91);
        brick2.setLocation(161,130);
        brick16.setLocation(452,188);
        brick5.setLocation(497,120);
        brick12.setLocation(425,35);
        brick11.setLocation(292,36);
        powerUpBlue2.setLocation(399,78);
        brick4.setLocation(394,120);
        brick12.setLocation(377,40);
        brick2.setLocation(144,128);
        brick14.setLocation(143,175);
        brick16.setLocation(460,190);
        brick5.setLocation(490,131);
        brick15.setLocation(285,218);
        brick12.setLocation(408,44);
        brick2.setLocation(167,133);
        brick.setLocation(73,133);
        powerUpBlue.setLocation(170,90);
        brick6.setLocation(277,76);
        brick11.setLocation(267,41);
        brick6.setLocation(260,86);
        brick3.setLocation(267,125);
        brick5.setLocation(493,125);
        brick16.setLocation(413,174);
        brick16.setLocation(445,172);
        brick14.setLocation(110,179);
        brick3.setLocation(271,138);
        brick4.setLocation(369,135);
        brick16.setLocation(441,195);
        brick4.setLocation(376,146);
        powerUpBlue2.setLocation(395,92);
        brick5.setLocation(494,134);
        brick.setLocation(36,140);
        brick.setLocation(76,128);
        brick.setLocation(27,124);
        brick.setLocation(74,135);
        brick2.setLocation(190,132);
        brick.setLocation(45,124);
        brick.setLocation(67,120);
        brick.setLocation(56,122);
        powerUpBlue.setLocation(148,81);
        powerUpBlue.setLocation(177,82);
        brick6.setLocation(282,82);
        powerUpBlue.setLocation(155,79);
        powerUpBlue.setLocation(161,84);
        brick6.setLocation(301,84);
        powerUpBlue.setLocation(174,83);
        powerUpBlue.setLocation(149,76);
        powerUpBlue.setLocation(179,77);
        powerUpBlue.setLocation(155,86);
        powerUpBlue.setLocation(175,89);
        powerUpBlue.setLocation(157,81);
        brick2.setLocation(145,128);
        brick2.setLocation(182,124);
        brick2.setLocation(145,124);
        brick2.setLocation(153,124);
        brick2.setLocation(155,119);
        brick2.setLocation(163,126);
        brick14.setLocation(101,178);
        brick6.setLocation(269,90);
        brick3.setLocation(275,132);
        brick4.setLocation(394,128);
        brick4.setLocation(362,125);
        brick4.setLocation(398,131);
        brick4.setLocation(361,127);
        brick4.setLocation(404,131);
        brick4.setLocation(368,132);
        brick4.setLocation(384,134);
        brick5.setLocation(489,135);
        powerUpBlue2.setLocation(375,84);
        powerUpBlue2.setLocation(393,94);
        brick12.setLocation(374,42);
        powerUpBlue2.setLocation(382,86);
        brick7.setLocation(485,82);
        brick5.setLocation(486,138);
        brick5.setLocation(500,130);
        brick7.setLocation(501,89);
        brick13.setLocation(487,50);
        brick13.setLocation(500,41);
        brick16.setLocation(429,175);
    }
}
