package com.learn.springbootlearn.event;


/**
 * Description: TODO
 * 使用场景:
 * 功能实现:
 * 影响及风险:
 * @author : zhe.han@ucarinc.com
 * @since : 2020/5/8 9:30 PM
 **/
public class Test {

	public static void main(String[] args) {
		WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();

		RainListener rainListener = new RainListener();
		SnowListener snowListener = new SnowListener();

		eventMulticaster.addListener(rainListener);
		eventMulticaster.addListener(snowListener);
	}
}
