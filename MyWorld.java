import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        super(600, 400, 1);
        Background back = new Background();
        addObject(back, 300, 200);
        Apple A = new Apple();
        Elephant E = new Elephant();
        addObject(E, 300, 300);
        spawnApple();
    }
    public void spawnApple(){
        Apple A1 = new Apple();
        int y = 0;
        int x = Greenfoot.getRandomNumber(600);
        addObject(A1, x, y);
    }
    public void act(){
         
    }
}
