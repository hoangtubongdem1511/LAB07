/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay() {
    }

    public MayBay(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 100;
    }
    
    public void catCanh(){
    }
    
    public void haCanh(){
    }

    @Override
    public String toString() {
        return super.toString() + "MayBay{" + "loaiNhienLieu=" + loaiNhienLieu + '}';
    }
}