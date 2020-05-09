package com.learn.springbootlearn.event;


import java.util.ArrayList;
import java.util.List;

/**
 * Description: TODO
 * 使用场景:
 * 功能实现:
 * 影响及风险:
 * @author : zhe.han@ucarinc.com
 * @since : 2020/5/8 9:25 PM
 **/
public abstract class AbstractEventMulticaster implements EventMulticaster{

	private List<WeatherListener> listenerList = new ArrayList<>();

	@Override
	public void multicastEvent(WeatherEvent event) {
		doStart();
		listenerList.forEach(i -> i.onWeatherEvent(event));
		doEnd();
	}

	@Override
	public void addListener(WeatherListener weatherListener) {
		listenerList.add(weatherListener);
	}

	@Override
	public void removeListener(WeatherListener weatherListener) {
		listenerList.remove(weatherListener);
	}

	abstract void doStart();

	abstract void doEnd();
}
