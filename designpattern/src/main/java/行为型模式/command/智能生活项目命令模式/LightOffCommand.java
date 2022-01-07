package 行为型模式.command.智能生活项目命令模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-06 17:37
 */
public class LightOffCommand implements Command {
    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
