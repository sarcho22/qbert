import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cubebert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubebert extends Actor
{
    /**
     * Act - do whatever the Cubebert wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String direction = "right";
    static boolean fall = false;
    public void act() 
    {
        // Add your action code here.
        move();
        fall();
    }    
    
    public void move() {
        if (Greenfoot.isKeyDown("q")) {
            //jump up and left
            if (direction == "right") {
                getImage().mirrorVertically();
            }
        }
        if (Greenfoot.isKeyDown("w")) {
            //jump up and right
        }
        if (Greenfoot.isKeyDown("a")) {
            //jump down and left
        }
        if (Greenfoot.isKeyDown("s")) {
            //jump down and right
        }
    }
    public void fall() {
        if (!this.isTouching(Bottom.class) && !this.isTouching(Top.class)) {
            fall = true;
        }
        if (fall == true) {
            setLocation(getX(), getY()+10);
            if (getY() > 650) {
                setLocation(getX(), 650);
            }
        }
    }
}
