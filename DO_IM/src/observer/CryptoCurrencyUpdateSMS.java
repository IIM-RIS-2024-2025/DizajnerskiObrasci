package observer;

public class CryptoCurrencyUpdateSMS implements Observer {

	private double bitcoinPrice; 
	private double etherPrice;
	@Override
	public void update(double bitcoinPrice, double etherPrice) {
		this.bitcoinPrice = bitcoinPrice;
		this.etherPrice = etherPrice;
		// onda posalji SMS
		sendSMS();
	}
	
	void sendSMS() {
		System.out.println("New price of bitcoin is: " + bitcoinPrice);
		System.out.println("New price of ether is: " + etherPrice);
	}

}
