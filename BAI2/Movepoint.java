/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class Movepoint implements Moveable {
    int x;
    int y;
    int xseed;
    int yseed;

    public Movepoint(int x, int y, int xseed, int yseed) {
        this.x = x;
        this.y = y;
        this.xseed = xseed;
        this.yseed = yseed;
    }

    @Override
    public void moveup() {
        y-=yseed;
    }

    @Override
    public void movedown() {
       y+=yseed;
    }

    @Override
    public void moveleft() {
        x-=xseed;
    }

    @Override
    public void moveright() {
        x+=xseed;
    }
    @Override
    public String toString() {
        return "Movepoint{" + "moveup" + x + ", y=" + y + ", xseed=" + xseed + ", yseed=" + yseed + '}';
    }
    
}
