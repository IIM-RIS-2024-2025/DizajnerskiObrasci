package observer2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CryptoCurrencyPrice {

	private double bitcoinPrice;
	private double etherPrice;
	
	public PropertyChangeSupport propertyChangeSupport;

	public CryptoCurrencyPrice(PropertyChangeSupport propertyChangeSupport) {
		this.propertyChangeSupport = propertyChangeSupport;
	}
	public void addPropertyChangeListener(PropertyChangeListener o) {
		propertyChangeSupport.addPropertyChangeListener(o);
	}
	public void removePropertyChangeListener(PropertyChangeListener o) {
		propertyChangeSupport.removePropertyChangeListener(o);
	}
	public double getEtherPrice() {
		return etherPrice;
	}
	public void setEtherPrice(double etherPrice) {
		//this.etherPrice = etherPrice;
		propertyChangeSupport.firePropertyChange("ether", this.etherPrice, etherPrice);
		this.etherPrice = etherPrice;
	}
	public double getBitcoinPrice() {
		return bitcoinPrice;
	}
	public void setBitcoinPrice(double bitcoinPrice) {
		propertyChangeSupport.firePropertyChange("bitcoin", this.bitcoinPrice, bitcoinPrice);
		this.bitcoinPrice = bitcoinPrice;
	}
	
	
}
