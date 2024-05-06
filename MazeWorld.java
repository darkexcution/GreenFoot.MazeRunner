import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,0,11*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,0,9*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,0,10*50);
        mazeBlock.setLocation(0,11*50);
        mazeBlock.setLocation(1*50,11*50);
        mazeBlock.setLocation(2*50,11*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,1*50,9*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,2*50,9*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,3*50,9*50);
        mazeBlock6.setLocation(3*50,9*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,3*50,11*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,3*50,8*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,4*50,11*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,5*50,11*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,5*50,9*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,6*50,11*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,7*50,11*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,7*50,10*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,7*50,9*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,7*50,8*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,6*50,7*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,5*50,7*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,3*50,7*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,2*50,7*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,1*50,7*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,1*50,5*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,2*50,5*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,5*50,6*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,5*50,5*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,3*50,5*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,1*50,4*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,0,2*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,1*50,2*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,2*50,2*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,3*50,2*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,3*50,3*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,1*50,1*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,2*50,1*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,5*50,4*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,5*50,3*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,5*50,2*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,5*50,1*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,6*50,2*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,7*50,2*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,8*50,0*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,9*50,1*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,9*50,2*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,9*50,3*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,8*50,4*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,7*50,4*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,7*50,5*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,8*50,6*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,9*50,7*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,9*50,9*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,9*50,10*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,10*50,10*50);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,10*50,2*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,10*50,5*50);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,11*50,6*50);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,7*50,0);
        MazeRunner mazeRunner = new MazeRunner(3);
        addObject(mazeRunner,24,568);
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,168,188);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,344,292);
        mazeBlock.setLocation(104,586);
        mazeBlock7.setLocation(139,578);
        mazeBlock9.setLocation(204,586);
        mazeBlock10.setLocation(252,586);
        mazeBlock12.setLocation(293,579);
        mazeBlock13.setLocation(360,574);
        mazeBlock13.setLocation(350,536);
        mazeBlock12.setLocation(308,566);
        mazeBlock12.setLocation(270,567);
        mazeBlock12.setLocation(291,553);
        mazeBlock10.setLocation(266,564);
        mazeBlock7.setLocation(164,577);
        mazeBlock10.setLocation(237,577);
        mazeBlock9.setLocation(209,564);
        mazeBlock.setLocation(117,570);
        mazeBlock.setLocation(116,569);
        mazeBlock9.setLocation(183,562);
        mazeBlock10.setLocation(235,559);
        mazeBlock12.setLocation(284,565);
        mazeBlock12.setLocation(301,574);
        mazeBlock10.setLocation(255,578);
        mazeBlock7.setLocation(207,578);
        mazeBlock.setLocation(120,581);
        mazeBlock7.setLocation(176,591);
        mazeBlock12.setLocation(296,586);
        mazeBlock9.setLocation(215,577);
        mazeBlock7.setLocation(166,568);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,344,575);
        mazeBlock7.setLocation(165,586);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,551,248);
        mazeBlock11.setLocation(244,483);
        YouWinPlatform youWinPlatform = new YouWinPlatform();
        addObject(youWinPlatform,569,34);
        EnnemyFlyer ennemyFlyer = new EnnemyFlyer();
        addObject(ennemyFlyer,93,147);
        EnnemyFlyer ennemyFlyer2 = new EnnemyFlyer();
        addObject(ennemyFlyer2,446,398);
        EnnemyWalker ennemyWalker = new EnnemyWalker(true);
        addObject(ennemyWalker,202,247);
        EnnemyWalker ennemyWalker2 = new EnnemyWalker(false);
        addObject(ennemyWalker2,140,296);
        mazeBlock11.setLocation(256,475);
    }
}
