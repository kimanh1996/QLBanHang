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
public class SanPham {

  private  int MaSanPham;

    private String TenSanPham;
    private int MaLoaiSanPham;
    private  int MaHangSanXuat;
    private String TenLoaiSanPham;

    public String getTenLoaiSanPham() {
        return TenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String TenLoaiSanPham) {
        this.TenLoaiSanPham = TenLoaiSanPham;
    }

    public SanPham(int MaSanPham, String TenSanPham, String TenLoaiSanPham, int GiaBan) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.TenLoaiSanPham = TenLoaiSanPham;
        this.GiaBan = GiaBan;
    }
    private int GiaNhap;
    
    private int GiaBan;
    private int TonKho;
    private int TrangThai;
     private String GhiChu;

    public SanPham(int MaSanPham, int GiaBan) {
        this.MaSanPham = MaSanPham;
        this.GiaBan = GiaBan;
    }

    public SanPham(int MaSanPham, String TenSanPham, int GiaBan) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.GiaBan = GiaBan;
    }

    public int getMaHangSanXuat() {
        return MaHangSanXuat;
    }

    public void setMaHangSanXuat(int MaHangSanXuat) {
        this.MaHangSanXuat = MaHangSanXuat;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public int getTonKho() {
        return TonKho;
    }

    public void setTonKho(int TonKho) {
        this.TonKho = TonKho;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public SanPham(int MaSanPham, String TenSanPham, int MaLoaiSanPham, int MaHangSanXuat, int GiaNhap, int GiaBan, int TonKho, int TrangThai, String GhiChu) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.MaLoaiSanPham = MaLoaiSanPham;
        this.MaHangSanXuat = MaHangSanXuat;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.TonKho = TonKho;
        this.TrangThai = TrangThai;
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return TenSanPham;
    }
    

    public int getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(int MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getMaLoaiSanPham() {
        return MaLoaiSanPham;
    }

    public void setMaLoaiSanPham(int MaLoaiSanPham) {
        this.MaLoaiSanPham = MaLoaiSanPham;
    }

    public SanPham(int MaSanPham, String TenSanPham, int MaLoaiSanPham, int GiaBan) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.MaLoaiSanPham = MaLoaiSanPham;
        this.GiaBan = GiaBan;
    }

 

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

}
