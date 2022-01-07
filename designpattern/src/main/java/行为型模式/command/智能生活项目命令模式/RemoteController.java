package 行为型模式.command.智能生活项目命令模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-07 14:16
 */
public class RemoteController {
    //开 按钮的命令数组
    private Command[] onCommands;
    //关 按钮的命令数组
    private Command[] offCommands;

    //执行撤销的命令
    private Command undoCommand;

    //构造器，完成对按钮的初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给我们的按钮设置需要的命令即可
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     *
     * @param no
     */
    public void onButtonWasPushed(int no) {
        //找到按下开的按钮
        onCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     *
     * @param no
     */
    public void offButtonWasPushed(int no) {
        //找到按下开的按钮
        offCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
