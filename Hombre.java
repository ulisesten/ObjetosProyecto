import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hombre extends Jugador
{
    private int pasos=0;
    
    private GreenfootImage ImgDer;
    private GreenfootImage ImgIzq;
    private GreenfootImage ImgUp;
    private GreenfootImage ImgDown;
    
    public Hombre()
    {
        
        ImgDer= new GreenfootImage("MaleRight1.png");
        ImgIzq= new GreenfootImage("MaleLeft1.png");
        ImgUp= new GreenfootImage("MaleUp1.png");
        ImgDown= new GreenfootImage("MaleDown1.png");
    }
    
    public void act()
    {
        mueve();
    }
    
    public void mueve()
    {
        int x=getX();
        int y=getY();
        
        if( Greenfoot.isKeyDown("left") ){
            mueveIzq(x,y);
        }
        if( Greenfoot.isKeyDown("right") ){
            mueveDer(x,y);
        }
        if( Greenfoot.isKeyDown("up") ){
            mueveUp(x,y);
        }
        if( Greenfoot.isKeyDown("down") ){
            mueveDown(x,y);
        }    
    }
    
    public void mueveIzq(int x,int y)
    {
        setLocation(x-1,y);
        wait(5);
        move(-10);
        setImage(ImgIzq);
    }
    
    public void mueveDer(int x,int y)
    {
        setLocation(x+1,y);
        wait(5);
        move(10);
        setImage(ImgDer);
    }
    
    public void mueveUp(int x,int y){
        setLocation(x,y-10);
            wait(5);
            setImage(ImgUp);
    }
    
    public void mueveDown(int x,int y){
        setLocation(x,y+10);
            wait(5);
            setImage(ImgDown);
    }
}