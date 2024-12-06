package observer2;

import java.beans.PropertyChangeSupport;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice observable = new CryptoCurrencyPrice(new PropertyChangeSupport(args));
		CryptoCurrencyUpdateSMS observer = new CryptoCurrencyUpdateSMS();
		
		observable.addPropertyChangeListener(observer);
		observable.setBitcoinPrice(1000);
		observable.setEtherPrice(2000);
		
	}

}
