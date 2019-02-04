package com.database.Service;

import java.sql.SQLException;
import com.database.DAO.bankAccountDAO;

import com.database.Util.DBoperation;

public class DBimplement implements bankAccountDAO {

	public boolean getAllCustomerName() {

		try {
			DBoperation.getAllCustomerName1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	public boolean branchesloanRelation() {

		try {
			DBoperation.branchesloanRelation1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean displayBranchTable() {

		try {
			DBoperation.displayBranchTable1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean accountNumberBalanceGT700() {

		try {
			DBoperation.accountNumberBalanceGT7001();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean accBalanceGT800() {

		try {
			DBoperation.accBalanceGT8001();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean branchAssestsRenameColassetsInThousands() {

		try {
			DBoperation.branchAssestsRenameColassetsInThousands1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean branchesBetn1to4million() {

		try {
			DBoperation.branchesBetn1to4million1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean nameAccNumBalanceCustHaveAcc() {

		try {
			DBoperation.nameAccNumBalanceCustHaveAcc1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean nameAccNumBalanceCustHaveAccBalance400orLess() {

		try {
			DBoperation.nameAccNumBalanceCustHaveAccBalance400orLess1();
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
