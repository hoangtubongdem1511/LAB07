/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
abstract class PhuongTienDiChuyen {
    private String loaiPhuongTien;
    private HangSanXuat hangSanXuat;
    
    public String layTenHangSanXuat() {
        return null;
    }
    
    public PhuongTienDiChuyen(){
    }
    
    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    

    public void batDau(){
    }
    
    public void tangToc(){
    }
    
    public void dungLai(){
    }
    
    abstract double layVanToc();

    @Override
    public String toString() {
        return "PhuongTienDiChuyen{" + "loaiPhuongTien=" + loaiPhuongTien + ", hangSanXuat=" + hangSanXuat + '}';
    }

    
}
