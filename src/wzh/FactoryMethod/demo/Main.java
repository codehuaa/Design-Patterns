package wzh.FactoryMethod.demo;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();

        Operation op = factory.CreateOperation();
        op.setNumber1(12);
        op.setNumber2(11);
        System.out.println(op.GetResult());
    }
}
