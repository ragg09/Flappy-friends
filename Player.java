import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor{
    private final double FLAP = 1.8;
    private boolean oldSpace = false;
    private double yVel = 0;
    private double y = 300;
    private boolean oldTouchingPipe = false;
    private static boolean dead;
    private static final int gunReloadTime = 25;
    private int reloadDelayCount = 15;
    private boolean shoot = false; 
    public Player(double yVel){
        GreenfootImage image = getImage();
        image.scale(46, 34);
        dead = false;
        this.yVel = yVel;
    }
    public Player(){
        this(0);
    }
    public void act() 
    {
        if(getOneIntersectingObject(Apple.class)!= null){
        Actor Apple = getOneIntersectingObject(Apple.class);
        {
        getWorld().removeObject(Apple);
        }
    }
    
    
        // reloadDelayCount++;
        // PowerShoot();
 
        // yVel += 0.02;
        // if(spacePressed()){
            // yVel = -FLAP;
        // }
        // y += yVel;
        // setLocation(getX(), y);
        // setRotation((int)(yVel * 16));
        // if(isAtEdge()){
            // dead = true;
        // }

        
        int x = getX();
        int y = getY();
        move(1);
        
       
        
        if(Greenfoot.isKeyDown("Left")){
        setLocation(x-1,y);
        }
        
        else if(Greenfoot.isKeyDown("Right")){
        setLocation(x+1,y);
        }
        
        else if(Greenfoot.isKeyDown("Up")){
        setLocation(x,y-1);
        }
        
        else if(Greenfoot.isKeyDown("Down")){
            setLocation(x,y+1);
        }
        
        boolean touchingPipe = false; 
        
        // if(touchingPipe = true){
            // getWorld().removeObject(this);
        // }
      
         dead = false;   
        
         if(getWorld().getObjects(Apple.class).isEmpty()){
            for(Pipe pipe : getWorld().getObjects(Pipe.class)){
            if(Math.abs(pipe.getX() - getX()) < 40){
                if(Math.abs(pipe.getY() + 30 - getY()) > 37){
                      dead = false;
                }
                touchingPipe = true;
            }
        }
        
        for(Pipe2 pipe2 : getWorld().getObjects(Pipe2.class)){
            if(Math.abs(pipe2.getX() - getX()) < 40){
                if(Math.abs(pipe2.getY() + 30 - getY()) > 37){
                    dead = false;
                }
                touchingPipe = true;
            }
        }
        
        for(Pipe3 pipe3 : getWorld().getObjects(Pipe3.class)){
            if(Math.abs(pipe3.getX() - getX()) < 40){
                if(Math.abs(pipe3.getY() + 30 - getY()) > 37){
                    dead = false;
                }
                touchingPipe = true;
            }
        }
        
        for(Pipe4 pipe4 : getWorld().getObjects(Pipe4.class)){
            if(Math.abs(pipe4.getX() - getX()) < 40){
                if(Math.abs(pipe4.getY() + 30 - getY()) > 37){
                    dead = false;
                }
                touchingPipe = true;
            }
        }
        
         for(Pipe5 pipe5 : getWorld().getObjects(Pipe5.class)){
            if(Math.abs(pipe5.getX() - getX()) < 40){
                if(Math.abs(pipe5.getY() + 30 - getY()) > 37){
                    dead = false;
                }
                touchingPipe = true;
            }
        }  
         }
         else{
             for(Pipe pipe : getWorld().getObjects(Pipe.class)){
            if(Math.abs(pipe.getX() - getX()) < 40){
                if(Math.abs(pipe.getY() + 30 - getY()) > 37){
                      dead = true;
                }
                touchingPipe = true;
            }
        }
        
        for(Pipe2 pipe2 : getWorld().getObjects(Pipe2.class)){
            if(Math.abs(pipe2.getX() - getX()) < 40){
                if(Math.abs(pipe2.getY() + 30 - getY()) > 37){
                    dead = true;
                }
                touchingPipe = true;
            }
        }
        
        for(Pipe3 pipe3 : getWorld().getObjects(Pipe3.class)){
            if(Math.abs(pipe3.getX() - getX()) < 40){
                if(Math.abs(pipe3.getY() + 30 - getY()) > 37){
                    dead = true;
                }
                touchingPipe = true;
            }
        }
        
        for(Pipe4 pipe4 : getWorld().getObjects(Pipe4.class)){
            if(Math.abs(pipe4.getX() - getX()) < 40){
                if(Math.abs(pipe4.getY() + 30 - getY()) > 37){
                    dead = true;
                }
                touchingPipe = true;
            }
        }
        
         for(Pipe5 pipe5 : getWorld().getObjects(Pipe5.class)){
            if(Math.abs(pipe5.getX() - getX()) < 40){
                if(Math.abs(pipe5.getY() + 30 - getY()) > 37){
                    dead = true;
                }
                touchingPipe = true;
            }
        } 
            }
          
    
       
        
        if(!oldTouchingPipe && touchingPipe && !dead){
            int num = 0;
            int num2 = 1;
            if(Score.ss() == 10)
            {
                
                FlappyWorld2 myWorld2 = new FlappyWorld2();
                Greenfoot.setWorld(myWorld2);
                
                num = 10;
            }
            
            if(Score.ss() == 20)
            {
                
                FlappyWorld3 myWorld3 = new FlappyWorld3();
                Greenfoot.setWorld(myWorld3);
                
                num = 20;
            }
            
            if(Score.ss() == 30)
            {
                
                FlappyWorld4 myWorld4 = new FlappyWorld4();
                Greenfoot.setWorld(myWorld4);
                
                num = 30;
            }
            
            if(Score.ss() == 40)
            {
                
                FlappyWorld5 myWorld5 = new FlappyWorld5();
                Greenfoot.setWorld(myWorld5);
                
                num = 40;
            }
        
            Score.add(num + num2);
            
        }
        oldTouchingPipe = touchingPipe;
        if(dead){
            if(getWorld() instanceof FlappyWorld){
                FlappyWorld myWorld = (FlappyWorld) getWorld();
                myWorld.gameOver();
                getWorld().removeObject(this);
     
            }
            if(getWorld() instanceof FlappyWorld2){
                FlappyWorld2 myWorld = (FlappyWorld2) getWorld();
                myWorld.gameOver();
                getWorld().removeObject(this);
               
            }
            if(getWorld() instanceof FlappyWorld3){
                FlappyWorld3 myWorld = (FlappyWorld3) getWorld();
                myWorld.gameOver();
                getWorld().removeObject(this);
             
            }
            if(getWorld() instanceof FlappyWorld4){
                FlappyWorld4 myWorld = (FlappyWorld4) getWorld();
                myWorld.gameOver();
                getWorld().removeObject(this);
               
            }
            if(getWorld() instanceof FlappyWorld5){
                FlappyWorld5 myWorld = (FlappyWorld5) getWorld();
                myWorld.gameOver();
                getWorld().removeObject(this);
                
            }
           
        }   
       
    }
    
   
    
    // public boolean spacePressed(){
        // boolean pressed = false;
        // if(Greenfoot.isKeyDown("space")){
            // if(!oldSpace){
                // pressed = true;
            // }
            // oldSpace = true;
        // }
        // else{
            // oldSpace = false;
        // }
        // return pressed;
    // }
    public static boolean isAlive(){
        return !dead;
    }
    public void setLocation(double x, double y){
        super.setLocation((int)x, (int)y);
    }
    
    public boolean PowerShoot(){
    if (Greenfoot.isKeyDown("space"))
        {
           if(reloadDelayCount >= gunReloadTime)
        {
            getWorld().addObject(new Missile(), getX(), getY());
            
            
            reloadDelayCount = 1;
        }
        }
        return true;
    }
}