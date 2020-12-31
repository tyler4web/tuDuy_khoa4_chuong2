package tuDuy_khoa4_chuong2_BuiQuocTrieu;

import java.util.ArrayList;
import java.util.Scanner;

/* Mục đích: quản lý danh sách nhiều nhân viên
 * Người tạo: Bùi Quốc Triệu
 * Ngày tạo: 30/12/2020
 * Version: 1.0
 * */

public class DanhSachNhanVien {

//	1.Attributes/ Data members/ Field
	private ArrayList<NhanVien> listNV = new ArrayList<NhanVien>();

//	2. Get, set method

	public ArrayList<NhanVien> getListNV() {
		return listNV;
	}

	public void setListNV(ArrayList<NhanVien> listNV) {
		this.listNV = listNV;
	}

//3 Constructor method
	public DanhSachNhanVien() {
		thietLapDefault();
	}

	private void thietLapDefault() {
		this.listNV = new ArrayList<NhanVien>();
	}

// 4.Input, output method
	public void nhap(Scanner scan) {
		for (NhanVien nv : this.listNV) {
			nv.nhap(scan);
		}
	}

	public void themNhanVien(NhanVien nv) {
		this.listNV.add(nv);
	}

	public void xuat() {
		for (NhanVien nv : this.listNV) {
			nv.xuat();
		}
	}

	public void xuatTongLuong() {
		xuatTongLuong();
	}

//5. Business Method
	public void tinhLuong() {
		for (NhanVien nv : this.listNV) {
			nv.tinhLuong();
		}
	}

	public float tinhTongLuong() {
		float tongLuong = 0;
		for (NhanVien nv : this.listNV) {
			nv.tinhLuong();
			tongLuong += nv.getLuong();
		}
		return tongLuong;
	}

	public ArrayList<NhanVien> timLuongCaoNhat() {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		if (this.listNV.size() > 0) {
			NhanVien nvMax = this.listNV.get(0); //
			for (NhanVien nvCurrent : this.listNV) {
				if (nvCurrent.getLuong() > nvMax.getLuong()) {
					nvMax = nvCurrent;
				}
			}
			// Đã tìm thấy nvLuongMax
			for (NhanVien nvCurrent : this.listNV) {
				if (nvCurrent.getLuong() == nvMax.getLuong()) {
					list.add(nvCurrent);
				}
			}
		}
		return list;
	}

}