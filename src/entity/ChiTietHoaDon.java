/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon {
    private int MaHoaDon;
    private int MaSanPham;
    private int SoLuong;
    private int gia;
    private int ThanhTien;

    public ChiTietHoaDon(int MaHoaDon, int MaSanPham, int SoLuong, int gia, int ThanhTien) {
        this.MaHoaDon = MaHoaDon;
        this.MaSanPham = MaSanPham;
        this.SoLuong = SoLuong;
        this.gia = gia;
        this.ThanhTien = ThanhTien;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public int getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(int MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public ChiTietHoaDon() {
    }
    
}
