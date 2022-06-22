import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class SniperMonkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SniperMonkey extends Monkeys
{
    MouseInfo mouse = Greenfoot.getMouseInfo();
    boolean isBought = false;
    GreenfootImage image;
    public SniperMonkey(){
        image = new GreenfootImage("Sniper Monkey Box Hitbox.png");
        image.scale(image.getWidth()/6, image.getHeight()/6);
        image.mirrorHorizontally();
        image.mirrorVertically();
        setImage(image);
        type = "sniperMonkey";
        name = "Sniper Monkey";
        cost = 300;
        attackSpeed = 100;
        level = 0;
        upgradeCost = cost * 2;
        sellCost = cost / 2;
    }
    
    public void act(){
        ArrayList<CamoBalloon> cBalloon = (ArrayList<CamoBalloon>)getWorld().getObjects(CamoBalloon.class);
        if(cBalloon.size() > 0){
            findCamo();
        }else{
            findBalloon("SniperMonkey");
        }
        super.act();
    }
}
