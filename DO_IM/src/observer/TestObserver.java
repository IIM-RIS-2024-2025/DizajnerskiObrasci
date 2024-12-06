package observer;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice observable = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS observer = new CryptoCurrencyUpdateSMS();
		
		observable.addObserver(observer);
		observable.setBitcoinPrice(1000);
		observable.setEtherPrice(2000);
		
	}

}
