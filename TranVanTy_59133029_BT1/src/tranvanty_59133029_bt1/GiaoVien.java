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
public class GiaoVien extends CaNhan{
    String MonDay;
    String ToBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String MonDay, String ToBoMon, String hoTen, int tuoi, String diachi, String sdt) {
        super(hoTen, tuoi, diachi, sdt);
        this.MonDay = MonDay;
        this.ToBoMon = ToBoMon;
    }

    public String getMonDay() {
        return MonDay;
    }

    public void setMonDay(String MonDay) {
        this.MonDay = MonDay;
    }

    public String getToBoMon() {
        return ToBoMon;
    }

    public void setToBoMon(String ToBoMon) {
        this.ToBoMon = ToBoMon;
    }

    @Override
    public String HienthiTT() {
        return hoTen+" "+ tuoi + " "+ diachi+ " "+ sdt+" "+ MonDay+" "+ToBoMon;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
