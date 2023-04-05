/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class XeOto extends PhuongTienDiChuyen {
    private String loainhienlieu;

    public XeOto() {
    }

    public XeOto(String loainhienlieu, String loaiphuongtien, HangSanXuat hangsanxuat) {
        super(loaiphuongtien, hangsanxuat);
        this.loainhienlieu = loainhienlieu;
    }
    
    @Override
    double layVanToc() {
        return 80;
    }

    @Override
    public String toString() {
        return super.toString() + "XeOto{" + "loainhienlieu=" + loainhienlieu + '}';
    }
    
    

}