package 行为型模式.observer.天气预报观察者模式;

import java.util.ArrayList;

/**
 * <p>
 * 此类为核心类<br>
 * 1.包含最新的天气情况信息<br>
 * 2.含有观察者集合，使用ArrayList管理<br>
 * 3.当数据有更新时，就主动的调用ArrayList，通知所有的接入方，就能看到最新的消息
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 0:39
 */
public class WeatherData implements Subject {
    /**
     * 温度
     */
    private float temperatrue;

    /**
     * 气压
     */
    private float pressure;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 观察者集合
     */
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        //调用接入方的update
        notifyObservers();
    }

    /**
     * 当数据有更新时就调用setData
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange，将最新的信息推送给接入方currentConditions
        dataChange();
    }

    /**
     * 注册一个观察者
     *
     * @param o 一个新注册的观察者
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除一个观察者
     *
     * @param o 被移除的观察者
     */
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    /**
     * 遍历所有的观察者并通知
     */
    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperatrue, pressure, humidity));
    }
}

