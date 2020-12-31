package wzh.DecorativePattern.demo;

public class ConcreteDecratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        AddedMethod();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedMethod() {
        System.out.println("这是具体装饰对象B的私有方法");
    }
}
