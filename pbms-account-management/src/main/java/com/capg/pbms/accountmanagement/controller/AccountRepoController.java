package com.capg.pbms.accountmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.service.IAccountManagementService;

@RestController
@RequestMapping("/api")
public class AccountRepoController {
	
	@Autowired(required=false)
	IAccountManagementService service;
	@PostMapping("/add")
	public ResponseEntity<AccountManagement> addAccount(@RequestBody AccountManagement account){
		return new ResponseEntity<AccountManagement>(account,HttpStatus.CREATED);
	}
	@GetMapping("/id/{accountId}")
	public ResponseEntity<AccountManagement> getAccount(@PathVariable("accountId") long accountId)
	{	
		return new ResponseEntity<AccountManagement>(service.getAccount(accountId),HttpStatus.OK); 		
    }
	
	@PutMapping("/updateName")
	public ResponseEntity<AccountManagement> updateCustomerName(@RequestBody AccountManagement account)
	{
	  return new ResponseEntity<AccountManagement>(service.updateCustomerName(account),HttpStatus.OK);
	}

	@DeleteMapping("/delete/id/{accountId}")
    public boolean deleteAccount(@PathVariable("accountId") long accountId)
    {
		return service.deleteAccount(accountId);
    }
	@GetMapping("/all")
	public ResponseEntity<List<AccountManagement>> getAllAccounts()
	{
		return new ResponseEntity<List<AccountManagement>>(service.getAllAccounts(),HttpStatus.OK);
	}
}
