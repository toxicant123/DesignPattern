package 行为型模式.observer.天气预报普通方案;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 0:45
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30, 150, 40);
    }
}
