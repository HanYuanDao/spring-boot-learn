package com.learn.springbootlearn.event;


/**
 * Description: TODO
 * 使用场景:
 * 功能实现:
 * 影响及风险:
 * @author : zhe.han@ucarinc.com
 * @since : 2020/5/8 9:11 PM
 **/
public class SnowEvent extends WeatherEvent {
	@Override
	public String getWeather() {
		return "Snow";
	}

}
