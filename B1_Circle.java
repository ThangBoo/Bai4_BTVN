package b4_btvn;

import java.util.ArrayList;
import java.util.Scanner;

class Sach {
	private String maS;
	private String tenS;
	private String tenTG;
	private String nxb;
	private int namxb;

	public String getMaS() {
		return maS;
	}

	public void setMaS(String maS) {
		this.maS = maS;
	}

	public String getTenS() {
		return tenS;
	}

	public void setTenS(String tenS) {
		this.tenS = tenS;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	public int getNamxb() {
		return namxb;
	}

	public void setNamxb(int namxb) {
		this.namxb = namxb;
	}

	public String getTenTG() {
		return tenTG;
	}

	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}

	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma sach: ");
		maS = sc.nextLine();
		System.out.print("Ten sach: ");
		tenS = sc.nextLine();
		System.out.print("Tac gia: ");
		tenTG = sc.nextLine();
		System.out.print("Nha xb: ");
		nxb = sc.nextLine();
		System.out.print("Nam xb: ");
		namxb = sc.nextInt();
	}

	public void Output() {

		System.out.printf("%-10s %-20s %-20s %-15s %-10s", maS, tenS, tenTG, nxb, namxb);
	}

	public Sach() {
	}

	public Sach(String maS, String tenS, String tenTG, String nxb, int namxb) {
		this.maS = maS;
		this.tenS = tenS;
		this.tenTG = tenTG;
		this.nxb = nxb;
		this.namxb = namxb;
	}
}

public class B1_Circle {
	public static void main(String[] args) {

		Sach[] a = new Sach[1];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Sach();
			System.out.println("Sach thu " + (i + 1));
			a[i].Input();
		}
		System.out.println("Ma sach  Ten Sach          Ten tac gia            Nha xuat ban          Nam san xuat  ");
		for (int i = 0; i < a.length; i++) {
			a[i].Output();
		}
	}
}
