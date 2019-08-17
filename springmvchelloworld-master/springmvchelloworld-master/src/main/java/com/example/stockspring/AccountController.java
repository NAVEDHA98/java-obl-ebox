package com.example.stockspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.model.Account;


//http://localhost:8080/accounts  --> get --> all the account details
//http://localhost:8080/accounts/1001  --> get -->return one account details
//http://localhost:8080/accounts  --> post --> insert one 
//http://localhost:8080/accounts  --> put --> insert update



@RequestMapping("accounts")
@RestController
public class AccountController {

	//http://localhost:8080/accounts  --> get 
	@RequestMapping("/")
	public List<Account> sayHello(){
		Account account=new Account();
		account.setAccountId(1001);
		account.setAccountType("saving");
		account.setBalance(23232.45f);
		
		Account account1=new Account();
		account1.setAccountId(1002);
		account1.setAccountType("saving");
		account1.setBalance(23232.45f);
		
		Account account2=new Account();
		account2.setAccountId(1003);
		account2.setAccountType("Current");
		account2.setBalance(23232.45f);
		
		List <Account>accounts=new ArrayList<Account>();
		accounts.add(account);
		accounts.add(account1);
		accounts.add(account2);
		
		return accounts;
	}
	

	//http://localhost:8080/accounts/1001  --> get -->return one account details
	
	@RequestMapping(path="{idValue}")
	public Account getAccount(@PathVariable("idValue") int id){
		Account account=new Account();
		account.setAccountId(id);
		account.setAccountType("saving");
		account.setBalance(23232.45f);
		return account;
		//ResponseEntity.ok().body(account);
		//return ResponseEntity.status(210)
		//					.header("test_header", "somevalue").build();
							
	}
	
	
	//http://localhost:8080/accounts
	@RequestMapping(method=RequestMethod.POST)
	public Account insertAccount(@RequestBody Account account){
		float balance =account.getBalance()+100.00f;
		System.out.println(balance);
		account.setBalance(balance);
		return account;
	}
	
	
	@RequestMapping(method=RequestMethod.PUT)
	public Account updateAccount(@RequestBody Account account){
		System.out.println("inside put");
		return account;
	}
	
	@RequestMapping(method=RequestMethod.PATCH)
	public Account patchAccount(@RequestBody Account account){
		System.out.println("inside patch");
		return account;
	}
	
	//http://localhost:8080/accounts?accountType=sal
	@RequestMapping(method=RequestMethod.GET)
	public Account searchAccoutByname(@RequestParam("accountType") String accType){
		Account account=new Account();
		account.setAccountId(1001);
		account.setAccountType(accType);
		account.setBalance(23232.45f);
		return account;
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public String delete(@PathVariable int id){
		return id+"has been deleted";
	}
	
	
}
