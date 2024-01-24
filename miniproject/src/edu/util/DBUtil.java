package edu.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	private static Properties p;
	private static String url;
	static {
		try {
			p = new Properties();
			p.load(DBUtil.class.getClassLoader().getResourceAsStream(
					"dbinfo.properties"));
			String driver = p.getProperty("driver");
			url = p.getProperty("url");
			Class.forName(driver);
		} catch (Exception e) {
			System.out.println("DBUtil(SB): " + e);
		}
	}

	public static Connection connect() throws Exception {
		return DriverManager.getConnection(url, p);
	}

	public static void close(Connection con, Statement st, ResultSet rs) {
		try {
			if (con != null)
				con.close();
			if (st!=null)
				st.close();
			if(rs!=null)
				rs.close();
		} catch (SQLException e) {
			System.out.println("DBUtil(close): "+e);
		}

	}
}
