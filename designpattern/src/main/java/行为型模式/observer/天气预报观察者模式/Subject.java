package 行为型模式.observer.天气预报观察者模式;

/**
 * <p>
 * 接口，让WeatherData来实现
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 9:24
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
