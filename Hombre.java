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
    private int pausa=5;
    
    private GreenfootImage ImgDer;
    private GreenfootImage ImgIzq;
    private GreenfootImage ImgUp;
    private GreenfootImage ImgDown;
    
    private GreenfootImage ImgDer2;
    private GreenfootImage ImgIzq2;
    private GreenfootImage ImgUp2;
    private GreenfootImage ImgDown2;
    
    public Hombre()
    {
        
        ImgDer= new GreenfootImage("MaleRight1.png");
        ImgIzq= new GreenfootImage("MaleLeft1.png");
        ImgUp= new GreenfootImage("MaleUp1.png");
        ImgDown= new GreenfootImage("MaleDown1.png");
        
        ImgDer2= new GreenfootImage("MaleRight2.png");
        ImgIzq2= new GreenfootImage("MaleLeft2.png");
        ImgUp2= new GreenfootImage("MaleUp2.png");
        ImgDown2= new GreenfootImage("MaleDown2.png");
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
        wait(pausa);
        move(-10);
        setImage(ImgIzq);
        wait(pausa);
        setImage(ImgIzq2);
    }
    
    public void mueveDer(int x,int y)
    {
        setLocation(x+1,y);
        wait(pausa);
        move(10);
        setImage(ImgDer);
        wait(pausa);
        setImage(ImgDer2);
    }
    
    public void mueveUp(int x,int y){
        setLocation(x,y-10);
        wait(pausa);
        setImage(ImgUp);
        wait(pausa);
        setImage(ImgUp2);
    }
    
    public void mueveDown(int x,int y){
        setLocation(x,y+10);
        wait(pausa);
        setImage(ImgDown);
        wait(pausa);
        setImage(ImgDown2);
    }
}