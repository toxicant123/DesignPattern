package 行为型模式.command.智能生活项目命令模式;

/**
 * <p>
 * 创建命令接口
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-06 17:31
 */
public interface Command {

    /**
     * 执行动作（操作）
     */
    void execute();

    //撤销动作
    void undo();
}
