package com.demo.service;

import java.util.List;
import java.util.Vector;

import com.demo.bean.Account;

public interface AccountService {

	void addAccount();

	List<Account> displayAll();

	

	void withdrawAmt(int id, double amt);

}
