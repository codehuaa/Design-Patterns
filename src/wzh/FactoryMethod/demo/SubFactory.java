package wzh.FactoryMethod.demo;

public class SubFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }

}
