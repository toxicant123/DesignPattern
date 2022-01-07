package 行为型模式.command.智能生活项目命令模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 14:44
 */
public class TVOnCommand implements Command {
    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
