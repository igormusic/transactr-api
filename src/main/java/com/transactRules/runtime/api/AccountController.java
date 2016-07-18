package com.transactRules.runtime.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.transactRules.runtime.model.Account;
import com.transactRules.runtime.repository.AccountRepository;

@RestController
@RequestMapping("api/v1/")
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@RequestMapping(value="shipwrecks", method = RequestMethod.POST)
	public Account create(@RequestBody Account shipwreck)
	{
		return accountRepository.saveAndFlush(shipwreck);
	}

}
