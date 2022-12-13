import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    Label titleLabel = new Label("Hungry Elephant", 75);
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 260, 90);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,540,45);
        elephant.setLocation(556,85);
        Label label = new Label("Press <Space> to Start", 40);
        addObject(label,252,292);
        label.setLocation(339,297);
        label.setLocation(331,332);
        label.setLocation(331,332);
        Label label2 = new Label("Use <A> to move left <D> to move right", 40);
        addObject(label2,292,186);
        label2.setLocation(298,180);
        Label label3 = new Label("<S> to move down <W> to move up", 40);
        addObject(label3,305,246);
        label3.setLocation(287,237);
        label.setLocation(306,324);
    }
}
