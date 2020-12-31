package wzh.AppearanceMode.demo;

public class Facade {
    SubSystemOne subSystemOne;
    SubSystemSecond subSystemSecond;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemSecond = new SubSystemSecond();
    }

    public void MethodA() {
        System.out.println("方法组A（）-----");
        subSystemOne.MethodOne();
    }

    public void MethodB() {
        System.out.println("方法组B（）-----");
        subSystemSecond.MethodSecond();
    }

    public void MethodC() {
        System.out.println("方法组C（）-----");
        subSystemOne.MethodOne();
        subSystemSecond.MethodSecond();
    }
}
