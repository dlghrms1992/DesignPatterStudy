package OpserverPattern.exercise;

/*import java.util.Observable;
import java.util.Observer;

import OpserverPattern.weather.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.95f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}
	
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}
	
	public void display() {
		System.out.println("화면 변경");
	}
	
}*/
