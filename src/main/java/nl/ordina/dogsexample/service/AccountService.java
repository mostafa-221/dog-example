package nl.ordina.dogsexample.service;


import nl.ordina.dogsexample.model.Account;
import org.springframework.stereotype.Component;

@Component
public interface AccountService {
	
	public Account loadAccount(Long accountId);
	
	public Long createAccount(Account account);
}
