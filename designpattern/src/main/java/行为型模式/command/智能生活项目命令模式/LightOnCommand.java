package 行为型模式.command.智能生活项目命令模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-06 17:33
 */
public class LightOnCommand implements Command {
    //聚合LightReceiver
    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.off();
    }
}
