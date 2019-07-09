package cn.itcast.test;

import cn.itcast.service.WeatherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        //创建容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-cxf-client.xml");
        //根据容器 获取service
        WeatherService service = (WeatherService)context.getBean("weatherService");
        //调用
        String name = service.getWeatherByCityName("北京");
        System.out.println(name);
    }
}
