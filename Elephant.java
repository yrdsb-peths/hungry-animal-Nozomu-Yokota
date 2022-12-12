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
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Elephant(){
        for(int i = 0; i < 8; i++){
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(75, 75);
        }
        
        for(int i = 0; i < idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(75, 75);
        }
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    int imageIndex = 0;
    public void animateElephant(){
        if(animationTimer.millisElapsed() < 150){
             return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight .length;
        }
        
        else{
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    public void move(){
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("A")){
            x-= 4;
            facing = "left";
        }
        if(Greenfoot.isKeyDown("D")){
            x+= 4;
            facing = "right";
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
