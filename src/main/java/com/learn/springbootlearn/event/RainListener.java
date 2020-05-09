package com.learn.springbootlearn.event;


/**
 * Description: TODO
 * 使用场景:
 * 功能实现:
 * 影响及风险:
 * @author : zhe.han@ucarinc.com
 * @since : 2020/5/8 9:21 PM
 **/
public class RainListener implements WeatherListener {
	@Override
	public void onWeatherEvent(WeatherEvent event) {
		if (event instanceof RainEvent) {
			System.out.println("hello" + event.getWeather());
		}
	}

}
