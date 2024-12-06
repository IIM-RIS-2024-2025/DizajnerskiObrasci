package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CryptoCurrencyPrice implements Observable {
	private double bitcoinPrice;
	private double etherPrice;
	
	List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()) {
			it.next().update(bitcoinPrice, etherPrice);
		}
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		notifyObservers();
	}

	public void setEtherPrice(double etherPrice) {
		this.etherPrice = etherPrice;
		notifyObservers();
	}

}
