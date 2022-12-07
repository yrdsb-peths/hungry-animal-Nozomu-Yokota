import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound sound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Elephant(){
        for(int i = 0; i < 8; i++){
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    int imageIndex = 0;
    public void animateElephant(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    public void move(){
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("A")){
            x -= 4;
        }
        if(Greenfoot.isKeyDown("D")){
            x+= 4;
        }
        setLocation(x, y);
        
        animateElephant();
    }
    public void act()
    {
        move();
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            MyWorld.score++;
            world.spawnApple();
            sound.play();
        }
    }
}
