package tuDuy_khoa4_chuong2_BuiQuocTrieu;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NhanVien nv = new NhanVien();
		Scanner scan = new Scanner(System.in);
//		DanhSachNhanVien ds = new DanhSachNhanVien();
		CongTyA cty = new CongTyA();
		cty.nhap();
		doMenu(cty);

	}

	private static void inMenu() {
		System.out.println("Vui lòng chọn thực hiện:");
		System.out.println("1. Thêm nhân viên");
		System.out.println("2. Xuất danh sách nhân viên");
		System.out.println("3. Tính tổng lương tất cả nhân viên");
		System.out.println("4. Tìm nhân viên lương cao nhất");
		System.out.println("0. Thoát");
	}

	public static void doMenu(CongTyA cty) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.println("Mời chọn");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				NhanVien nv = new NhanVien();
				nv.nhap(scan);
				cty.themNhanVien(nv);
				break;
			case 2:
				cty.tinhLuong();
				cty.xuat();
				break;
			case 3:
//				cty.tinhLuong();
				cty.tinhTongLuong();
				cty.xuatTongLuong();
				break;
			case 4:
				ArrayList<NhanVien> list = cty.timNVLuongCaoNhat();
				for (NhanVien nv1 : list) {
					nv1.xuat();
				}
				break;
			case 0:
				flag = false;
				break;

			}
		} while (flag);
	}

}
