package OpserverPattern.weather;

import java.util.ArrayList;

/*
 * 옵저버 패턴이란 ? 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의.
 * - 시스템 확장이 가능하게 하려면? 느슨합 결합~!
 * 느슨한 결합의 위력 : 두 객체가 느슨하게 결합되어 있다는 것은, 그 둘이 상호작용을 하긴 하지만 서로에 대해 서로 잘 모른다는 것을 의미
 * 옵저버 패턴에서는 주제와 옵저버가 느슨하게 결합되어 있는 객체 디자인을 제공
 * 이유
 * 1. 주제가 옵저버에 대해서 아는 것은 옵저버가 특정 인터페이스를 구현 한다는 것 뿐
 * 2. 옵저버는 언제든지 새로 추가할 수 있다.
 * 3. 새로운 형식의 옵저버를 추가하려고 할 때도 주제를 전혀 변경할 필요가 없다.
 * 4. 주제와 옵저버는 서로 독립적으로 재사용 할 수 있다.
 * 5. 주제나 옵저버가 바뀌더라도 서로한테 영향을 미치지 않는다.
 * 
 * 디자인 원칙 - 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다. 
 *---------------------------------------------------------------------------
 *객체지향 원칙 
 *바뀌는 부분은 캡슐화한다.
 *상속보다는 구성을 활용
 *구현이 아닌 인터페이스에 맞춰서 프로그래밍 한다.
 *
 *서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야한다.
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
