package com.capg.pbms.accountmanagement.service;

import java.util.List;

import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.model.Customer;

public interface IAccountManagementService {
	
	 AccountManagement  addAccount(AccountManagement account) ;
	 	 
	 AccountManagement  getAccount(long accountId);
	 
	 List<AccountManagement> getAllAccounts();
	 
	 AccountManagement  updateCustomerName(AccountManagement account);
	 
//	 AccountManagement  updateCustomerContact(AccountManagement account);
//	 
//	 AccountManagement  updateCustomerAddress(AccountManagement account);
	 
	 boolean deleteAccount(long accountId);

	


}
