package cn.itcast.service;

public class WeatherServiceImpl implements WeatherService {
	/**
	 * 此处就不经过数据库了，为的是演示webservice的用法
	 * 直接写死在方法里
	 */
	public String getWeatherByCityName(String cityName) {
		if("北京".equals(cityName)){
			return "万里无云";
		}else if("上海".equals(cityName)){
			return "小雨";
		}else if("深圳".equals(cityName)){
			return "晴";
		}
		return "未知";
	}
}
