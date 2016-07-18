package com.transactRules.runtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactRules.runtime.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
