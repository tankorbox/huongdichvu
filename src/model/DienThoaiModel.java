package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.DienThoai;
import library.ConnectMySQDBLLibrary;

public class DienThoaiModel {
	private ConnectMySQDBLLibrary connectMySQDBLLibrary;
	private Connection conn;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	public DienThoaiModel() {
		connectMySQDBLLibrary = new ConnectMySQDBLLibrary();
	}

	public ArrayList<DienThoai> getAll() {
		conn = connectMySQDBLLibrary.getConnectMySQL();
		ArrayList<DienThoai> listDT = new ArrayList<>();
		String sql = "SELECT * FROM dienthoai";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				DienThoai obj = new DienThoai(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10),
						rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15),
						rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20),
						rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24));
				System.out.println(obj.getTen());
				listDT.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDT;
	}

	public DienThoai getDienThoaiById(int id) {
		conn = connectMySQDBLLibrary.getConnectMySQL();
		DienThoai dt = null;
		String sql = "SELECT * FROM dienthoai WHERE ID=" + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				dt = new DienThoai(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10),
						rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15),
						rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20),
						rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24));
				System.out.println(dt.getTen());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dt;
	}

	public int addItem(DienThoai obj) {
		// TODO Auto-generated method stub
		int result = 0;
		conn = connectMySQDBLLibrary.getConnectMySQL();
		String sql = "INSERT INTO " + "dienthoai" + " VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, obj.getTen());
			pst.setString(2, obj.getHinhanh());
			pst.setInt(3, obj.getId_hangsanxuat());
			pst.setInt(4, obj.getLuotxem());
			pst.setInt(5, obj.getBanchay());
			pst.setInt(6, obj.getGia());
			pst.setString(7, obj.getKichco());
			pst.setString(8, obj.getBangtan());
			pst.setString(9, obj.getChip());
			pst.setString(10, obj.getCpu());
			pst.setString(11, obj.getMemory());
			pst.setString(12, obj.getRam());
			pst.setString(13, obj.getCambien());
			pst.setString(14, obj.getBluetooth());
			pst.setString(15, obj.getWlan());
			pst.setString(16, obj.getGps());
			pst.setString(17, obj.getPin());
			pst.setString(18, obj.getManhinh());
			pst.setString(19, obj.getSim());
			pst.setString(20, obj.getCameratruoc());
			pst.setString(21, obj.getCamerasau());
			pst.setString(22, obj.getQuayphim());
			pst.setString(23, obj.getDanhgia());
			pst.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int delItem(int maTB) {
		// TODO Auto-generated method stub
		int result = 0;
		conn = connectMySQDBLLibrary.getConnectMySQL();
		String sql = "DELETE FROM " + "dienthoai" + " WHERE id =  ? ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, maTB);
			pst.executeUpdate();
			result = 1;
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int editItem(DienThoai obj) {
		int result = 0;
		conn = connectMySQDBLLibrary.getConnectMySQL();
		String query = "UPDATE dienthoai SET tendienthoai=?,hinhanh=?,"
				+ "id_hangsanxuat=?,luotxem=?,banchay=?,gia=?,kichco=?,bangtan=?,chip=?,"
				+ "cpu=?,memory=?,ram=?,camien=?,"
				+ "bluetooth=?,wlan=?, gps=?, pin=?,manhinh=?, sim=?, cameratruoc=?, "
				+ "camerasau=?, quayphim=?,danhgia=? WHERE id = ? LIMIT 1";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, obj.getTen());
			pst.setString(2, obj.getHinhanh());
			pst.setInt(3, obj.getId_hangsanxuat());
			pst.setInt(4, obj.getLuotxem());
			pst.setInt(5, obj.getBanchay());
			pst.setInt(6, obj.getGia());
			pst.setString(7, obj.getKichco());
			pst.setString(8, obj.getBangtan());
			pst.setString(9, obj.getChip());
			pst.setString(10, obj.getCpu());
			pst.setString(11, obj.getMemory());
			pst.setString(12, obj.getRam());
			pst.setString(13, obj.getCambien());
			pst.setString(14, obj.getBluetooth());
			pst.setString(15, obj.getWlan());
			pst.setString(16, obj.getGps());
			pst.setString(17, obj.getPin());
			pst.setString(18, obj.getManhinh());
			pst.setString(19, obj.getSim());
			pst.setString(20, obj.getCameratruoc());
			pst.setString(21, obj.getCamerasau());
			pst.setString(22, obj.getQuayphim());
			pst.setString(23, obj.getDanhgia());
			result = pst.executeUpdate();
			System.out.println("da vao model" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
	}
}
