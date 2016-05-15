import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    private int x=100;// Controlando posición x de botones en conjunto
    private int y=2;// Controlando posición y de botones en conjunto
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // Agregando y posicionando botones
        super(900, 600, 1);
        addObject(new BotonOpciones(),x+201,y+59);
        addObject(new BotonSalir(),x+60,y+195);
        addObject(new BotonAyuda(),x+60,y+333);
        addObject(new BotonJugar(),x+270,y+267);
    }
}
