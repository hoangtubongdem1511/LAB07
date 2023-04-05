/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class XeDap extends PhuongTienDiChuyen{

    public XeDap() {
    }

    public XeDap(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
    }

    @Override
    double layVanToc() {
        return 20;
    }

    @Override
    public String toString() {
        return super.toString() + "XeDap{" + '}';
    }
    
}
