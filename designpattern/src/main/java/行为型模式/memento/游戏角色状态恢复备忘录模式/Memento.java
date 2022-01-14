package 行为型模式.memento.游戏角色状态恢复备忘录模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-14 14:42
 */
public class Memento {
    /**
     * 攻击力
     */
    private int vit;

    /**
     * 防御力
     */
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
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
