package com.database.Util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.database.Service.DBimplement;

public class DBoperationTest {

	@Test
	public void testGetAllCustomerName() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.getAllCustomerName());
	}

	@Test
	public void testBranchesloanRelation() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.branchesloanRelation());
	}
	
	@Test
	public void testDisplayBranchTable() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.displayBranchTable());
	}
	
	@Test
	public void testAccountNumberBalanceGT700() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.accountNumberBalanceGT700());
	}
	
	@Test
	public void testAccBalanceGT800() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.accBalanceGT800());
	}

	@Test
	public void testBranchAssestsRenameColassetsInThousands() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.branchAssestsRenameColassetsInThousands());
	}
	
	@Test
	public void testBranchesBetn1to4million() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.branchesBetn1to4million());
	}
	
	
	@Test
	public void testNameAccNumBalanceCustHaveAcc() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.nameAccNumBalanceCustHaveAcc());
	}
	
	@Test
	public void testNameAccNumBalanceCustHaveAccBalance400orLess() {
		DBimplement db = new DBimplement();
		assertEquals(true, db.nameAccNumBalanceCustHaveAccBalance400orLess());
	}
	

	
	
	
}
