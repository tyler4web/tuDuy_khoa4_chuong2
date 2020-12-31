package tuDuy_khoa4_chuong2_BuiQuocTrieu;

import java.sql.Date;
import java.util.Scanner;

/* Mục đích: quản lý các nghiệp vụ liên quan đến nhân viên
 * Người tạo: Bùi Quốc Triệu
 * Ngày tạo: 30/12/2020
 * Version: 1.0
 * */

public class NhanVien {
//1.Thuộc tính
	private int maNhanVien;
	private String hoTen;
	private String ngaySinh;
	private String diaChi;
	private float luong;
	private float heSoLuong;
	private float luongCoBan;
	private float tongLuong;

	// 2. Get, set methods
	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public float getLuong() {
		return luong;
	}
	
	public float getTongLuong() {
		return tongLuong;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public float getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

//3. Constructor methods

	public NhanVien() {

	}
	
	public NhanVien(int maNhanVien, String hoTen) {

		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		
	}
	
	public NhanVien(int maNhanVien,String hoTen, float luong) {

		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.luong = luong;
		
	}
	
	public NhanVien(int maNhanVien, float heSoLuong, float luongCoBan, float luong) {

		this.maNhanVien = maNhanVien;
		this.heSoLuong = heSoLuong;
		this.luongCoBan = luongCoBan;
		this.luong = luong;
		
	}
	
	

	public NhanVien(int maNhanVien, String hoTen, String ngaySinh, String diaChi, float heSoLuong, float luongCoBan) {

		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.heSoLuong = heSoLuong;
		this.luongCoBan = luongCoBan;
		
	}

//4. Input, output methods
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã nhân viên: ");
		this.maNhanVien = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập họ và tên: ");
		this.hoTen = scan.nextLine();

		System.out.print("Nhập ngày sinh: ");
		this.ngaySinh = scan.nextLine();

		System.out.print("Nhập địa chỉ: ");
		this.diaChi = scan.nextLine();

		System.out.print("Nhập hệ số lương: ");
		this.heSoLuong = Float.parseFloat(scan.nextLine());

		System.out.print("Nhập mức lương cơ bản: ");
		this.luongCoBan = Float.parseFloat(scan.nextLine());
	}
	
	public void xuat() {
		System.out.println("Mã Nhân Viên: " + this.maNhanVien + "\t Họ Tên: " + this.hoTen + "\t Ngày Sinh: " + this.ngaySinh
				+ "\t Địa Chỉ: " + this.diaChi + "\t Hệ Số Lương: " + this.heSoLuong + "\t Lương Căn bản: " + this.luongCoBan + "\t Lương:"
				+ this.luong);
	}
	
	public void xuatTongLuong(float tongLuong) {
		System.out.println("Tổng lương nhân viên: " + this.tongLuong);
	}
//5. Business method
	
	public void tinhLuong() {
		this.luong = this.heSoLuong * this.luongCoBan;
	}
	

}
