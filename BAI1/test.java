/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class test {
    public static void main(String[] args) {
        MayBay maybay = new MayBay();
        System.out.println("vt may bay:" + maybay.layVanToc());
        maybay.toString();
        
        XeOto oto = new XeOto();
        System.out.println("vt oto:" + oto.layVanToc());
        oto.toString();
        
        XeDap xedap = new XeDap();
        System.out.println("vt xe may:" + xedap.layVanToc());
        xedap.toString();
        
    }
}
