package 行为型模式.observer.天气预报观察者模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 9:46
 */
public class BaiduSite implements Observer {
    /**
     * 温度
     */
    private float temperature;

    /**
     * 气压
     */
    private float pressure;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 更新天气情况，是由WeatherData来调用，使用推送模式
     *
     * @param temperature 温度
     * @param pressure    气压
     * @param humidity    湿度
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示
     */
    public void display() {
        System.out.println("-------百度网站--------");
        System.out.println("***百度网站 气温: " + temperature + "***");
        System.out.println("***百度网站 气压: " + pressure + "***");
        System.out.println("***百度网站 湿度: " + humidity + "***");
    }
}
