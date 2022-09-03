import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyWorld3 extends World
{
    public FlappyWorld3(){    
        super(600, 400, 1);
        addObject(new Player(-1.3), 100, 300);
        addObject(new Pipe3(), 300, 175);
        addObject(new Pipe3(), 600, 175);
        addObject(new Score(), 300, 100); 
         addObject(new Apple(), 300, 200);
    }
    public void gameOver(){
        addObject(new GameOver(), 300, 200);
    }
}
