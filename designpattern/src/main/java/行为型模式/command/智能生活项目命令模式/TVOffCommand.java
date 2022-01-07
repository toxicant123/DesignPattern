package 行为型模式.command.智能生活项目命令模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 14:41
 */
public class TVOffCommand implements Command {
    /**
     * 聚合TVReceiver
     */
    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
