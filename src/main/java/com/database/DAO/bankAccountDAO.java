package com.database.DAO;

public interface bankAccountDAO {

	boolean getAllCustomerName();
	boolean branchesloanRelation();
	boolean displayBranchTable();
	boolean accountNumberBalanceGT700();
	boolean accBalanceGT800();
	boolean branchAssestsRenameColassetsInThousands();
	boolean branchesBetn1to4million();
	boolean nameAccNumBalanceCustHaveAcc();
	boolean nameAccNumBalanceCustHaveAccBalance400orLess();
	
}        
