package wzh.ChainOfResponsibilityModel.demo;

public class ConcreteHandler2 extends Handler {
    @Override
    public void HandleReqest(int request) {
        // 0-10,处理此请求
        if(request >= 10 && request < 20) {
            System.out.println("请求"+request+"被处理完成");
            System.out.println("-----------------------");
        } else {
            System.out.println("我的权限不够，已向上级申请");
            if (successor != null) {
                successor.HandleReqest(request);
            } else {
                System.out.println("无人可以处理请求");
            }
        }
    }
}
