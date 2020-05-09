package com.learn.springbootlearn.event;


/**
 * Description: TODO
 * 使用场景:
 * 功能实现:
 * 影响及风险:
 * @author : zhe.han@ucarinc.com
 * @since : 2020/5/8 9:23 PM
 **/
public interface EventMulticaster {

	void multicastEvent(WeatherEvent event);

	void addListener(WeatherListener weatherListener);

	void removeListener(WeatherListener weatherListener);
}
