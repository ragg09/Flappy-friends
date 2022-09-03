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
    private boolean touchingMissile = false;
    public void act() 
    {
        // Add your action code here.
       moveAround();
        // if(getOneIntersectingObject(Player.class)!= null){
        // Actor Player = getOneIntersectingObject(Player.class);
        // {
        // touchingMissile = true;;
        // getWorld().removeObject(this)
        // }
        
       
        
    // }
}
    public void moveAround()
    {
        move(4);
        if(Greenfoot.getRandomNumber(100) < 10)
        {
        turn(Greenfoot.getRandomNumber(90) - 45);
        }
    }
}