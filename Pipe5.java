import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pipe5 extends Actor
{
    public Pipe5(){
        GreenfootImage image = getImage();
        image.scale(512, 900);
    }
    public void act() 
    {
        if(Player.isAlive()){
            setLocation(getX() - 1, getY());
        }
        if(getX() <= 1){
            setLocation(getX() + 700, 75 + Greenfoot.getRandomNumber(225));
        }
    }
}
