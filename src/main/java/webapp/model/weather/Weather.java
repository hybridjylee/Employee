package webapp.model.weather;

import java.util.List;


public class Weather {
			
	Current current;
	List<Forecast> forcecasts;
	
	public Current getCurrent() {
		return current;
	}
	public void setCurrent(Current current) {
		this.current = current;
	}
	public List<Forecast> getForcecasts() {
		return forcecasts;
	}
	public void setForcecasts(List<Forecast> forcecasts) {
		this.forcecasts = forcecasts;
	}
	
	
}
