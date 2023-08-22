package b4_btvn;

import java.util.Scanner;

class HCN {
	private double d;
	private double r;

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public HCN() {

	}

	public HCN(double d, double r) {
		this.d = d;
		this.r = r;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("chieu dai: ");
		d = sc.nextDouble();
		System.out.print("chieu rong: ");
		r = sc.nextDouble();
	}

	public void xuat() {
		System.out.println("HCN sau khi nhap co:");
		System.out.println("Dai: " + d);
		System.out.println("Rong: " + r);

	}

	public void veHCN() {
		for (int i = 0; i < r; i++) {
			for (int j = 1; j < d; j++) {
				System.out.print("*");

			}
			System.out.println("*");
		}
	}

	public float chuVi() {
		return (float) (d + r) * 2;
	}

	public float dienTich() {
		return (float) (d * r);
	}

}

public class Bai2 {
	public static void main(String[] args) {
		HCN x = new HCN();
		x.nhap();
		x.veHCN();
		System.out.println("Chu vi " + x.chuVi());
		System.out.println("Dien tich: " + x.dienTich());
	}
}
