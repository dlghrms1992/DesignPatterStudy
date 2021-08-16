package OpserverPattern.weather;

import java.util.ArrayList;

/*
 * ������ �����̶� ? �� ��ü�� ���°� �ٲ�� �� ��ü�� �����ϴ� �ٸ� ��ü������ ������ ���� �ڵ����� ������ ���ŵǴ� ������� �ϴ�� �������� ����.
 * - �ý��� Ȯ���� �����ϰ� �Ϸ���? ������ ����~!
 * ������ ������ ���� : �� ��ü�� �����ϰ� ���յǾ� �ִٴ� ����, �� ���� ��ȣ�ۿ��� �ϱ� ������ ���ο� ���� ���� �� �𸥴ٴ� ���� �ǹ�
 * ������ ���Ͽ����� ������ �������� �����ϰ� ���յǾ� �ִ� ��ü �������� ����
 * ����
 * 1. ������ �������� ���ؼ� �ƴ� ���� �������� Ư�� �������̽��� ���� �Ѵٴ� �� ��
 * 2. �������� �������� ���� �߰��� �� �ִ�.
 * 3. ���ο� ������ �������� �߰��Ϸ��� �� ���� ������ ���� ������ �ʿ䰡 ����.
 * 4. ������ �������� ���� ���������� ���� �� �� �ִ�.
 * 5. ������ �������� �ٲ���� �������� ������ ��ġ�� �ʴ´�.
 * 
 * ������ ��Ģ - ���� ��ȣ�ۿ��� �ϴ� ��ü ���̿����� �����ϸ� �����ϰ� �����ϴ� �������� ����ؾ� �Ѵ�. 
 *---------------------------------------------------------------------------
 *��ü���� ��Ģ 
 *�ٲ�� �κ��� ĸ��ȭ�Ѵ�.
 *��Ӻ��ٴ� ������ Ȱ��
 *������ �ƴ� �������̽��� ���缭 ���α׷��� �Ѵ�.
 *
 *���� ��ȣ�ۿ��� �ϴ� ��ü ���̿����� �����ϸ� �����ϰ� �����ϴ� �������� ����ؾ��Ѵ�.
 *
 *
 *
 */
public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		
		if(i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for(int i = 0 ; i < observers.size() ; i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
}
