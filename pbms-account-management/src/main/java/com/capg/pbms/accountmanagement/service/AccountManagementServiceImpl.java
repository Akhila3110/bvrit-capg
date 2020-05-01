package com.capg.pbms.accountmanagement.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.pbms.accountmanagement.exceptions.AccountAlreadyExistException;
import com.capg.pbms.accountmanagement.exceptions.AccountNotFoundException;
import com.capg.pbms.accountmanagement.exceptions.EmptyAccountListException;
import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.repository.IAccountManagementRepo;
@Service
public class AccountManagementServiceImpl implements IAccountManagementService {
	
	@Autowired(required=false)
	IAccountManagementRepo accountrepo;
 
	@Override
	@Transactional
	public AccountManagement addAccount(AccountManagement account) {
		if(accountrepo.existsById(account.getAccountId()))
			throw new AccountAlreadyExistException("Customer with Id: " +account.getAccountId()+" is Already Exist");
		return accountrepo.save(account);
	}

	@Override
	@Transactional
	public AccountManagement getAccount(long accountId) {
		if(!accountrepo.existsById(accountId)) 
		{	
		   throw new AccountNotFoundException("Customer with Id "+accountId+" Not Found");
		}
	    return accountrepo.getOne(accountId);
	}

	@Override
	@Transactional
	public AccountManagement updateCustomerName(AccountManagement account) {
		if(!accountrepo.existsById(account.getAccountId()))
			
	throw new AccountNotFoundException("Customer with Id : " +account.getAccountId()+" Not Found");
	
		AccountManagement newAccount=accountrepo.getOne(account.getAccountId());
		newAccount.setCustomerDetails(account.getCustomerDetails());
//		newCustomer.setCustomerContact(customer.getCustomerContact());
//		newCustomer.setCustomerAddress(customer.getCustomerAddress());
//		newCustomer.setCustomerGender(customer.getCustomerGender());
               accountrepo.save(newAccount);
		         return newAccount;	
	}

	@Override
	@Transactional 
	public boolean deleteAccount(long accountId) {
			if(!accountrepo.existsById(accountId)) 
			{	
			   throw new AccountNotFoundException("Customer with Id "+accountId+" Not Found");
			}
			accountrepo.deleteById(accountId);
			return !accountrepo.existsById(accountId);
			

		}

	@Override
	public List<AccountManagement> getAllAccounts() {
	
		 if(accountrepo.count()==0)
		    throw new EmptyAccountListException("No Account Found in Account Database");
			return accountrepo.findAll();
	}

	}


