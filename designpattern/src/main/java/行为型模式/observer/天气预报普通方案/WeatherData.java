package 行为型模式.observer.天气预报普通方案;

/**
 * <p>
 * 此类为核心类<br>
 * 1.包含最新的天气情况信息<br>
 * 2.含有CurrentConditions对象<br>
 * 3.当数据有更新时，就主动的调用CurrentConditions对象的update方法（包括了display）方法，这样接入方就看到最新的信息
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 0:39
 */
public class WeatherData {
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
     * 接入方
     */
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
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
}

