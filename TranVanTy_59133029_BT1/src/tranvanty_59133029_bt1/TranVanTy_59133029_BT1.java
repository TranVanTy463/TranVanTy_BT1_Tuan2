/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranvanty_59133029_bt1;

/**
 *
 * @author Administrator
 */
public class TranVanTy_59133029_BT1 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien NV1 = new NhanVien("Trần Văn Tý", 21,"An Hòa",50000, 200);
        NhanVien NV2 = new NhanVien("Nguyễn Ngọc Nhân", 19,"An Hòa",30000, 100);
     
        System.out.printf("Nhân Viên 1 :"+NV1.getThongTin()+" "+NV1.tinhThuong()+"\n");
        System.out.printf("Nhân Viên 2 :"+NV2.getThongTin()+" "+NV2.tinhThuong()+"\n");
    }
    
}
