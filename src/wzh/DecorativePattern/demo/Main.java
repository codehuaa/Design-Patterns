package wzh.DecorativePattern.demo;

public class Main {
    public static void main(String[] args) {
        Component c = new ConcreteComponent();
        ConcreteDecratorA concreteDecratorA = new ConcreteDecratorA();
        ConcreteDecratorB concreteDecratorB = new ConcreteDecratorB();

        concreteDecratorA.SetComponent(c);
        concreteDecratorB.SetComponent(concreteDecratorA);
        concreteDecratorB.Operation();
    }
}
