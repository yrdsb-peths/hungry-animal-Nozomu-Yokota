import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0; 
    Label scoreLabel;
    int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        super(600, 400, 1, false);
        Background back = new Background();
        addObject(back, 300, 200);
        Apple A = new Apple();
        Elephant E = new Elephant();
        addObject(E, 300, 300);
        spawnApple();
        scoreLabel = new Label(0, 75);
        addObject(scoreLabel, 30, 30);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 10 == 0)
        {
            level += 1;
        }
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void spawnApple(){
        Apple A1 = new Apple();
        A1.setSpeed(level);
        int y = 0;
        int x = Greenfoot.getRandomNumber(600);
        addObject(A1, x, y);
    }
    
    public void act(){
    
    }
}
