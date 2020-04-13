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
        LopHoc LHoc = new LopHoc();
        HocSinh HS1 = new HocSinh("59CNTT-1","CNTT","TRAN VAN TY",21,"AN HOA","0389124463");
        HocSinh HS2 = new HocSinh("59CNTT-2","CNTT","NGUYEN TAI BI",22,"HOA DA - AN MY","0352733797");
        HocSinh HS3 = new HocSinh("59CNTT-3","CNTT","TRAN VAN NO ",20,"DONG DA - HA NOI","0389234475");
        GiaoVien GV1 = new GiaoVien("LAP TRINH TBDD", "CNTT", "Huynh Tuan Anh", 45, "NHA TRANG- KHANH HOA", "0945865165");
        GiaoVien GV2 = new GiaoVien("MAU THIET KE", "CNTT", "Huynh Tuan Anh", 45, "NHA TRANG - KHANH HOA", "0945865165");
        
        LHoc.themHocSinh(HS1);
        LHoc.themHocSinh(HS2);
        LHoc.themHocSinh(HS3);
        LHoc.themGVGD(GV1);
         LHoc.themGVGD(GV2);
        
        LHoc.qldsHS.xoa("TRAN VAN TY");
        LHoc.inDSHS();
        LHoc.inDSGVGD();
    }
    
}
