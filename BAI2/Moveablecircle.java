/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class Moveablecircle implements Moveable{
    int radius;
    Movepoint a;

    public Moveablecircle(int radius, Movepoint a) {
        this.radius = radius;
        this.a = a;
    }        

    @Override
    public void moveup() {
        a.y=a.y-a.yseed;
    }

    @Override
    public void movedown() {
       a.y=a.y+a.yseed;
    }

    @Override
    public void moveleft() {
       a.x=a.x-a.xseed; 
    }

    @Override
    public void moveright() {
        a.x=a.x-a.xseed;
    }

    @Override
    public String toString() {
        return "" + a.toString()+","+radius +"";
    }
}
