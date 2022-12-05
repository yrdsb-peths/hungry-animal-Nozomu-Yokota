import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int gravity = 2;
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y + gravity);
        int bottom = getWorld().getHeight();
        if(getY() > bottom){
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            world.removeObject(this);
        }
        // Add your action code here.
    }
}
