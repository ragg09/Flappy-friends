  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Actor
{
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Missile(){
    GreenfootImage image = getImage();
        image.scale(100, 100);
    }
    public void act() 
    {
        // Add your action code here.
        {
        setLocation(getX()+10, getY());
        Stuff();
        if (getWorld()!=null)
        {

            if (isAtEdge())
            {
                getWorld().removeObject(this); 

            }
        }
        
        

    }
    
    }    
    
    public void Stuff()
    {
        boolean kill = true;
}}
