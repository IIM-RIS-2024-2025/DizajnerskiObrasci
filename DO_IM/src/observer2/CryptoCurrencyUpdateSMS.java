package observer2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CryptoCurrencyUpdateSMS implements PropertyChangeListener{
	private double bitcoinPrice;
	private double etherPrice;
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName() == "bitcoin") {
			this.bitcoinPrice = (double) evt.getNewValue();
		}
		if(evt.getPropertyName() == "ether") {
			this.etherPrice = (double) evt.getNewValue();
		}
		sendSMS();
		
	}
	void sendSMS() {
		System.out.println("New price of bitcoin is: " + bitcoinPrice);
		System.out.println("New price of ether is: " + etherPrice);
	}
	
	
}
