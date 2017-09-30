package bean;

import java.util.Date;

public class DonHang {

	private int id;
	private int id_user;
	private String hoten;
	private String diachi;
	private String sodienthoai;
	private Date ngaykhoitao;
	private int trangthaithanhtoan;
	private int id_ht_thanh_toan;
	private String tt_them;

	public DonHang() {
		super();
	}

	public DonHang(int id, int id_user, String hoten, String diachi,
			String sodienthoai, Date ngaykhoitao, int trangthaithanhtoan,
			int id_ht_thanh_toan, String tt_them) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.hoten = hoten;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.ngaykhoitao = ngaykhoitao;
		this.trangthaithanhtoan = trangthaithanhtoan;
		this.id_ht_thanh_toan = id_ht_thanh_toan;
		this.tt_them = tt_them;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public Date getNgaykhoitao() {
		return ngaykhoitao;
	}

	public void setNgaykhoitao(Date ngaykhoitao) {
		this.ngaykhoitao = ngaykhoitao;
	}

	public int getTrangthaithanhtoan() {
		return trangthaithanhtoan;
	}

	public void setTrangthaithanhtoan(int trangthaithanhtoan) {
		this.trangthaithanhtoan = trangthaithanhtoan;
	}

	public int getId_ht_thanh_toan() {
		return id_ht_thanh_toan;
	}

	public void setId_ht_thanh_toan(int id_ht_thanh_toan) {
		this.id_ht_thanh_toan = id_ht_thanh_toan;
	}

	public String getTt_them() {
		return tt_them;
	}

	public void setTt_them(String tt_them) {
		this.tt_them = tt_them;
	}

}
