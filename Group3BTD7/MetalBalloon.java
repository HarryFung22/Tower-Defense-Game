import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MetalBalloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MetalBalloon extends Balloons
{
    GreenfootImage image;
    public MetalBalloon(){
        metal = true;
        health = 10;
        speed = 1;
        image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    public void act()
    {
        onPath();
        attacked();
        if(health < 1){
            ((GameWorld) getWorld()).addMoney(20);
            ((GameWorld) getWorld()).addScore(5);
            getWorld().removeObject(this);
        }
    }
}
