package 行为型模式.observer.天气预报普通方案;

/**
 * <p>
 * 显示当前天气情况（可以理解成是气象站自己的网站）
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 0:36
 */
public class CurrentConditions {
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
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
