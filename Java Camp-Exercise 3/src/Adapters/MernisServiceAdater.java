package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdater implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy clientKpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return clientKpsPublicSoapProxy.TCKimlikNoDogrula(customer.getNationallityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;	
		}

}
