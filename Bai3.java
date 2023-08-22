package b4_btvn;

import java.util.Scanner;

class SinhVien
{
	private String maSV;
	private String hoTen;
	private double toan;
	private double ly;
	private double hoa;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}
	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma sv: ");
		maSV = sc.nextLine();
		System.out.print("Ten: ");
		hoTen = sc.nextLine();
		System.out.print("Toan: ");
		toan = sc.nextDouble();
		System.out.print("Ly: ");
		ly = sc.nextDouble();
		System.out.print("Hoa: ");
		hoa = sc.nextDouble();
	}
	
	public void xuat()
	{
		System.out.printf("%-10s %-20s %-5s %-5s %-5s %-5s", maSV, hoTen, toan, ly, hoa, diemTB());
	
	}
	public SinhVien()
	{}
	public SinhVien(String maSV, String hoTen, double toan, double ly, double hoa)
	{
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	public float diemTB()
	{
		if(toan>=0&&ly>=0&&hoa>=0)
			return (float)(toan+ly+hoa)/3;
		return 0;
	}
}
public class Bai3 {
	public static void main(String[] args)
	{
		SinhVien[] s = new SinhVien[1];
		for(int i =0; i<s.length; i++)
		{
			s[i] = new SinhVien();
			System.out.println("Nhap sinh vien thu " + (i+1));
			s[i].nhap();
		}
		System.out.println("Ma SV   Ho Ten                    Toan     Ly     Hoa    TB");
		for(int i= 0; i<s.length; i++)
		{
			s[i].xuat();
		}
	}
}
