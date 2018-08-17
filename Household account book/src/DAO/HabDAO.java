package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Hab;

public class HabDAO {


//引数のIDに一致するレコードをemployeeテーブルから1件取得する。
	public static Hab Insert(String day, String expenses, String memo, int payment, int withdwaral) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Hab result = null;

		try {
			// ②JDBCドライバをロードする
			Class.forName("com.mysql.jdbc.Driver");

			// ③DBMSとの接続を確立する
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kadai_db?useSSL=false",
					"root",
					"Gundamf91");
			// ④SQL文を作成する
			String sql = "Insert into hab values(?,?,?,?,?)";
			// ⑤SQL文を実行するための準備を行う
			////String day, String expenses, String memo, int payment, int withdrawal
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, day);
			pstmt.setString(2, expenses);
			pstmt.setString(3, memo);
			pstmt.setInt(4, payment);
			pstmt.setInt(5, withdwaral);

			// ⑥SQL文を実行してDBMSから結果を受信する
			pstmt.executeUpdate();

			result = new Hab(day, expenses, memo, payment, withdwaral);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ⑧DBMSから切断する
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DBアクセス時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return result;
	}
}