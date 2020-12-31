package wzh.ChainOfResponsibilityModel.demo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        handler1.setSuccessor(handler2);

        int[] list = new int[]{1, 10, 40};
        for (int i = 0; i < list.length; i++) {
            handler1.HandleReqest(list[i]);
        }
    }
}
