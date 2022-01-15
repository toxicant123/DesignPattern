package 行为型模式.chainofresponsibility.OA系统审批职责链模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 19:45
 */
public abstract class Approver {
    /**
     * 下一个处理者
     */
    Approver approver;

    String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 用于设置下一个处理者
     *
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理审批请求地方法，得到一个请求，处理是子类完成，因此该方法做成抽象
     *
     * @param purchaseRequest
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
