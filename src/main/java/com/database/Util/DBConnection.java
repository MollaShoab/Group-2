package com.database.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import lombok.extern.slf4j.*;




@Slf4j
public class DBConnection {
//	private static final Logger logger=LoggerFactory.getLogger(DBConnection.class);

	public static Connection conn;
	//private static DBConnection instance = null;

	DBConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACLSCRAPR01:1433;"
					+ "databaseName=BankAccountMNG;user=bankaccountmng_dbo;password=bankaccountmng_dbo123");
			log.info("connection created.");
			// conn.close();
		} catch (Exception e) {
			log.error("Connection error: " + e.getMessage());
		}
	}

//	public static DBConnection getInstance() {
//		if (instance == null) {
//			instance = new DBConnection();
//			return instance;
//		} else {
//			return instance;
//		}
//
//	}

	public Connection getConnection() {
		return conn;

	}

	public static void closeAll(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();

			} catch (SQLException e) {
				log.error("The result set cannot be closed.", e);
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				log.error("The statement cannot be closed.", e);
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				log.error("The data source connection cannot be closed.", e);
			}
		}
	}

	public static void main(String[] args) throws SQLException {
		new DBConnection();
		//System.out.println("successfull");
		//DBoperation.getAllCustomerName1();
		
	}
}
