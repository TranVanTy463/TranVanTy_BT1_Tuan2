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
public class NhanVien {
    String ten;
    int tuoi;
    String diachi;
    double tienluong;
    int tonggio;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int tonggio) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tonggio = tonggio;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTonggio() {
        return tonggio;
    }

    public void setTonggio(int tonggio) {
        this.tonggio = tonggio;
    }
    String getThongTin()
    {
        return ten + " " + tuoi + " " + diachi + " " + tienluong+ " " +tonggio+ " " ;
    }
    double tinhThuong()
    {
        double tienthuong;
        if (tonggio >= 200)
            {
                return tienthuong=tienluong * (20.0/100);
            }
              
            else if(tonggio < 200 && tonggio >= 100)
            {
                return tienthuong=tienluong * (10.0/100);
            }
            else
            {
                return tienthuong=0 ;
            }
    }
}
