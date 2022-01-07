package 行为型模式.command.智能生活项目命令模式;

/**
 * <p>
 * 没有任何命令，即空执行，用于初始化每个按钮，当调用空命令时，对象什么都不做。<br>
 * 其实这样也是一种设计模式，可以省略掉对空判断
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-06 17:44
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
