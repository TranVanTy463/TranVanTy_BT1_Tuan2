/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranvanty_59133029_bt1;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class LopHoc {
    QLDS qldsHS = new QLDS();
    QLDS qldsGV = new QLDS();
    ArrayList<GiaoVien> GVGD = new ArrayList<>();
    GiaoVien GVCN = new GiaoVien();

    public LopHoc() {
    }
    public int themHocSinh(HocSinh HS){
        qldsHS.them(HS);
        return 1 ;
    }
    public int themGVGD(GiaoVien GV)
    {
        qldsGV.them(GV);
        return 1;
    }
    public void inDSHS(){
        qldsHS.inds();
    }
    public void inDSGVGD(){
        qldsGV.inds();
    }
}
