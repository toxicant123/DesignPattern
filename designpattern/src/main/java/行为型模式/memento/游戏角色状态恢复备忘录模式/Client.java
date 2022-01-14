package 行为型模式.memento.游戏角色状态恢复备忘录模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 14:52
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和BOSS大战前的状态");
        gameRole.display();

        //把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和BOSS大战");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        System.out.println("大战后，使用备忘录对象恢复到大战前");

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态");

        gameRole.display();

    }
}
