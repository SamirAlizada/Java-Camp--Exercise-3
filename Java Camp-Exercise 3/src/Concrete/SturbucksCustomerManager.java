package Concrete;

import Abstract.CustomerManager;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class SturbucksCustomerManager extends CustomerManager{
	
	CustomerCheckService _customerCheckService;

	public SturbucksCustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void Save(Customer customer){

		try {
			if (_customerCheckService.checkIfRealPerson(customer)) {    
				super.Save(customer);
			}else {
				System.out.println("Not a valid person");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}
	
}
