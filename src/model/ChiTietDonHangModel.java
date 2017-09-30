package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.ChiTietDonHang;
import library.ConnectMySQDBLLibrary;

public class ChiTietDonHangModel {
	private ConnectMySQDBLLibrary connectMySQDBLLibrary;
	private Connection conn;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	public ChiTietDonHangModel() {
		connectMySQDBLLibrary = new ConnectMySQDBLLibrary();
	}

	public ArrayList<ChiTietDonHang> getAll() {
		conn = connectMySQDBLLibrary.getConnectMySQL();
		ArrayList<ChiTietDonHang> listCTDH = new ArrayList<ChiTietDonHang>();
		String sql = "SELECT * FROM chitietdonhang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ChiTietDonHang obj = new ChiTietDonHang(rs.getInt(1),
						rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getInt(5), rs.getInt(6));
				System.out.println(obj.getTensanpham());
				listCTDH.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCTDH;
	}

	public ChiTietDonHang getChiTietDonHangbyId(int id) {
		conn = connectMySQDBLLibrary.getConnectMySQL();
		ChiTietDonHang ctdh = null;
		String sql = "SELECT * FROM dienthoai WHERE ID=" + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ctdh = new ChiTietDonHang(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4), rs.getInt(5),
						rs.getInt(6));
				System.out.println(ctdh.getTensanpham());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ctdh;
	}

	public int addChiTietDonHang(ChiTietDonHang obj) {
		int result = 0;
		conn = connectMySQDBLLibrary.getConnectMySQL();
		String sql = "INSERT INTO " + "chitietdonhang"
				+ " VALUES (null,?,?,?,?,?) ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, obj.getTensanpham());
			pst.setString(2, obj.getHinhanh());
			pst.setInt(3, obj.getGia());
			pst.setInt(4, obj.getSoluong());
			pst.setInt(5, obj.getId_don_hang());
			pst.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int delChiTietDonHang(int id) {
		int result = 0;
		conn = connectMySQDBLLibrary.getConnectMySQL();
		String sql = "DELETE FROM " + "chitietdonhang" + " WHERE id =  ? ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			result = 1;
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public static void main(String args[]) {
		ChiTietDonHangModel model = new ChiTietDonHangModel();
		System.out.println(model.getAll().size());
	}
}
