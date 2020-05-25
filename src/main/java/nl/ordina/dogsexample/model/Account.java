package nl.ordina.dogsexample.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

	private Long accountId;

	private EnumAccountType accountType;	

	private Double balance;
	
	public Account(){}
	
	public Account(Long accountId, EnumAccountType accountType, Double balance){
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public Account(EnumAccountType accountType, Double balance){
		this.accountType = accountType;
		this.balance = balance;
	}
}
