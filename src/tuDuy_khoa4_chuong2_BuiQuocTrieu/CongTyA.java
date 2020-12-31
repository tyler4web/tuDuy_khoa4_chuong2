package tuDuy_khoa4_chuong2_BuiQuocTrieu;

import java.util.ArrayList;

/* Mục đích: quản lý danh sách nhân viên công ty A
 * Người tạo: Bùi Quốc Triệu
 * Ngày tạo: 30/12/2020
 * Version: 1.0
 * */

public class CongTyA {
	private float tongLuong;
	
	// 1. Attributes
		private DanhSachNhanVien dsnvCongTyA;

		//2. Get, set methods

		public DanhSachNhanVien getDsnvCongTyA() {
			return dsnvCongTyA;
		}

		public void setDsnvCongTyA(DanhSachNhanVien dsnvCongTyA) {
			this.dsnvCongTyA = dsnvCongTyA;
		}
		
		//3. Constructors
		public CongTyA() {
			this.dsnvCongTyA = new DanhSachNhanVien();
		}
		//4. Input, Output
		public void nhap() {
			NhanVien nv = new NhanVien(1,"nobita", "1 thang 1", "nhat ban", 1.0f, 10);
			this.dsnvCongTyA.themNhanVien(nv);
			nv = new NhanVien(2,"doraemon", "2 thang 1", "Vietnam", 2.0f, 20);
			this.dsnvCongTyA.themNhanVien(nv);
			nv = new NhanVien(3,"xuka", "3 thang 1", "Uc", 3.0f, 20);
			this.dsnvCongTyA.themNhanVien(nv);
			nv = new NhanVien(3,"xeko", "4 thang 1", "Anh", 3.0f, 20);
			this.dsnvCongTyA.themNhanVien(nv);
		}
		
		public void xuat() {
			this.dsnvCongTyA.xuat();
		}
//		
//		public void xuatTongLuong() {
//			this.dsnvCongTyA.xuatTongLuong();
//		}
//		
		public void xuatTongLuong() {
			System.out.println("Tổng lương tất cả nhân viên: " + tongLuong);
		}
		
		
		//5.Business methods
		
		public void themNhanVien(NhanVien nv) {
			this.dsnvCongTyA.themNhanVien(nv);
		}
		
		public void tinhLuong() {
			this.dsnvCongTyA.tinhLuong();
		}
		
		public float tinhTongLuong() {
			tongLuong =this.dsnvCongTyA.tinhTongLuong();
			return tongLuong;
		}
	
		
		public ArrayList<NhanVien> timNVLuongCaoNhat() {
			return this.dsnvCongTyA.timLuongCaoNhat();
		}
		
		public void xuatHelper(ArrayList<NhanVien> list) {

			for (NhanVien nv : list) {
				nv.xuat();

			}
		}
}

