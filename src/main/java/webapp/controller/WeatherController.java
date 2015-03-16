package webapp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webapp.model.weather.Weather;
import webapp.service.WeatherService;

@Controller
@RequestMapping("/weather")
public class WeatherController {
	static Log log = LogFactory.getLog(WeatherController.class);
	
	@Autowired // 타입
	WeatherService service;
	
	@RequestMapping(value={"", "/"}, method=RequestMethod.GET) // POST돌때 호출안됨.
	public String showForm(){
		log.info("############");
		log.info("###showList()#####");
		log.info("############");
		
		return "weather/form";
	}
	@RequestMapping(value="/show",method=RequestMethod.POST)
	public String showWeather(Model model, String city){
		log.info("############");
		log.info("###showWeather()#####");
		log.info("############");
		log.info("city = "+city);
		
		Weather weather = service.getWeather(city);
		model.addAttribute("weather", weather);
		return "weather/weather";
	}
	
}
