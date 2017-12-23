/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaĐon {
    private int MaHoaDon;
    private int MaKhachHang;
    private int MaNhanVien;
    private Date  NgayLap;
    private int TongTien;
    private String GhiChu;
    private int HoanThanh;

    public HoaĐon(int MaHoaDon, int MaKhachHang, int MaNhanVien, Date NgayLap, int TongTien, String GhiChu, int HoanThanh) {
        this.MaHoaDon = MaHoaDon;
        this.MaKhachHang = MaKhachHang;
        this.MaNhanVien = MaNhanVien;
        this.NgayLap = NgayLap;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
        this.HoanThanh = HoanThanh;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getHoanThanh() {
        return HoanThanh;
    }

    public void setHoanThanh(int HoanThanh) {
        this.HoanThanh = HoanThanh;
    }
    
}
