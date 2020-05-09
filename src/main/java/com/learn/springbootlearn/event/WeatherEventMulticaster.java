package com.learn.springbootlearn.event;


/**
 * Description: TODO
 * 使用场景:
 * 功能实现:
 * 影响及风险:
 * @author : zhe.han@ucarinc.com
 * @since : 2020/5/8 9:29 PM
 **/
public class WeatherEventMulticaster extends AbstractEventMulticaster {
	@Override
	void doStart() {
		System.out.println("begin broadcast WeatherEvent!");
	}

	@Override
	void doEnd() {
		System.out.println("end broadcast WeatherEvent!");
	}

}
