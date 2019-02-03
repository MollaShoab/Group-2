package com.database.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.database.DAO.bankAccountDAO;

import com.database.Util.DBoperation;

public class DBimplement implements bankAccountDAO {

	public boolean getAllCustomerName() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.getAllCustomerName1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean branchesloanRelation() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.branchesloanRelation1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean displayBranchTable() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.displayBranchTable1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean accountNumberBalanceGT700() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.accountNumberBalanceGT7001();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean accBalanceGT800() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.accBalanceGT8001();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean branchAssestsRenameColassetsInThousands() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.branchAssestsRenameColassetsInThousands1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean branchesBetn1to4million() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.branchesBetn1to4million1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean nameAccNumBalanceCustHaveAcc() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.nameAccNumBalanceCustHaveAcc1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean nameAccNumBalanceCustHaveAccBalance400orLess() {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.nameAccNumBalanceCustHaveAccBalance400orLess1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
