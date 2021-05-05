import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Adapters.MernisServiceAdater;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException{
		CustomerManager customerManager = new SturbucksCustomerManager(new MernisServiceAdater());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Samir");
		customer.setLastName("Alizada");
		customer.setDateOfBirth(2003);
		customer.setNationallityId(123456789);
		customerManager.Save(customer);
		System.out.println();
	}

}


