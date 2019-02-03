package com.database.Util;

import java.sql.*;

import com.database.Model.Employee;
import com.database.Model.Trainer;

//import db_connection.naztech.io.DBConnection;

public class DBoperation {

	public static void getAllCustomerName1() throws SQLException {
		DBConnection conn = new DBConnection();
		// Connection dbConnection = conn.getConnection();

		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task01}");
		// stmt.setInt(1, 10);
		// stmt.setString(2, "kona");

		stmt.execute();

		System.out.println("_____________________");
		
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String name = rs.getObject(1).toString();

			System.out.println("Name : " + name);
		}
	}

	public static void branchesloanRelation1() throws SQLException {
		DBConnection conn = new DBConnection();
		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task02 }");
		stmt.execute();

		System.out.println("_____________________");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String branch_name = rs.getObject(1).toString();
			System.out.println("branch_name : " + branch_name);
		}
	}

	
	public static void displayBranchTable1() throws SQLException {
		DBConnection conn = new DBConnection();
		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task03 }");
		stmt.execute();

		System.out.println("_____________________");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String branch_name = rs.getObject(1).toString();
			System.out.println("Branch  : " + branch_name);
		}
	}
	
	public static void accountNumberBalanceGT7001() throws SQLException {
		DBConnection conn = new DBConnection();
		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task04 }");
		stmt.execute();

		System.out.println("_____________________");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String account_number  = rs.getObject(1).toString();
			System.out.println("account_number   : " + account_number );
		}
	}
	
	public static void accBalanceGT8001() throws SQLException {
		DBConnection conn = new DBConnection();
		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task05 }");
		stmt.execute();

		System.out.println("_____________________");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String account_number  = rs.getObject(1).toString();
			String balance = rs.getObject(2).toString();
			System.out.println("account_number   : " + account_number + "balance :" + balance);
		}
	}
	
	public static void branchAssestsRenameColassetsInThousands1() throws SQLException {
		DBConnection conn = new DBConnection();
		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task06 }");
		stmt.execute();

		System.out.println("_____________________");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String account_number  = rs.getObject(1).toString();
			String assets_1000 = rs.getObject(2).toString();
			System.out.println("account_number   : " + account_number + "assets/1000 :" + assets_1000);
		}
	}
	
	public static void branchesBetn1to4million1() throws SQLException {
		DBConnection conn = new DBConnection();
		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task07 }");
		stmt.execute();

		System.out.println("_____________________");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String branch_name = rs.getObject(1).toString();
			System.out.println("Branch  : " + branch_name);
		}
	}
	
	public static void nameAccNumBalanceCustHaveAcc1() throws SQLException {
		DBConnection conn = new DBConnection();
		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task08 }");
		stmt.execute();

		System.out.println("_____________________");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String customer_name  = rs.getObject(1).toString();
			String acc_number  = rs.getObject(2).toString();
			String balance  = rs.getObject(3).toString();
			
			System.out.println("customer_name   : " + customer_name + ", acc_number : " + acc_number + ", balance : " + balance);
		}
	}
	
	public static void nameAccNumBalanceCustHaveAccBalance400orLess1() throws SQLException {
		DBConnection conn = new DBConnection();
		CallableStatement stmt = null;

		stmt = conn.conn.prepareCall("{call g2task09 }");
		stmt.execute();

		System.out.println("_____________________");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String customer_name  = rs.getObject(1).toString();
			String acc_number  = rs.getObject(2).toString();
			String balance  = rs.getObject(3).toString();
			
			System.out.println("customer_name   : " + customer_name + ", acc_number : " + acc_number + ", balance : " + balance);
		}
	}

}
