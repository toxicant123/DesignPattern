package 行为型模式.chainofresponsibility.OA系统审批职责链模式;

/**
 * <p>
 * 请求类
 * </p>
 *
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 19:43
 */
public class PurchaseRequest {
    /**
     * 请求类型
     */
    private int type;

    private float price = 0.0f;

    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
