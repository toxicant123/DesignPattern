package 行为型模式.memento.游戏角色状态恢复备忘录模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 14:45
 */
public class GameRole {
    /**
     * 攻击力
     */
    private int vit;

    /**
     * 防御力
     */
    private int def;

    /**
     * 创建Memento，即根据当前的状态得到Memento
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    /**
     * 从备忘录对象，恢复GameRole的状态
     *
     * @param memento
     */
    public void recoverGameRoleFromMemento(Memento memento) {
        vit = memento.getVit();
        def = memento.getDef();
    }

    /**
     * 显示当前游戏角色的状态
     */
    public void display() {
        System.out.println("游戏角色当前的攻击力：" + vit + "，防御力：" + def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
