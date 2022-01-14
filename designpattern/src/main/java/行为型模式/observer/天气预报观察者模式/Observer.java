package 行为型模式.observer.天气预报观察者模式;

/**
 * <p>
 * 观察者接口，有观察者来实现
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 9:26
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
