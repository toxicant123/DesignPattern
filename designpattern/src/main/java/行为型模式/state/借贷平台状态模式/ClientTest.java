package 行为型模式.state.借贷平台状态模式;

/**
 * @author toxicant123
 * @version 1.0
 * @Description
 * @create 2022-01-15 12:30
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建context 对象
        Context context = new Context();
        //将当前状态设置为 PublishState
        context.setState(new PublishState());
        System.out.println(context.getCurrentState());

//        //publish --> not pay
        context.acceptOrderEvent(context);
//        //not pay --> paid
        context.payOrderEvent(context);
//        // 失败, 检测失败时，会抛出异常
//        try {
//        	context.checkFailEvent(context);
//        	System.out.println("流程正常..");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

    }

}
