package cn.itcast.service;

import javax.jws.WebService;

@WebService //当写了此接口时，表明当前接口是一个webservice接口
public interface WeatherService {
	/**
	 * 根据城市名称，获取城市天气
	 * @param cityName
	 * @return
	 */
	String getWeatherByCityName(String cityName);
}
