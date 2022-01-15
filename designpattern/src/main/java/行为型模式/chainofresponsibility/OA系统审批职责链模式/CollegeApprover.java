package 行为型模式.chainofresponsibility.OA系统审批职责链模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 19:50
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("请求编号 id=" + purchaseRequest.getId() + "被" + name + "处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
