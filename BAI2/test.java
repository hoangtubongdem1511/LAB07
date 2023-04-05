/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class test {
    public static void main(String[] args) {
        Moveable m=new Movepoint(5,5,5,5);
        m.moveup();
        m.movedown();
        m.moveleft();
        m.moveright();
        m.toString();
    }
}
