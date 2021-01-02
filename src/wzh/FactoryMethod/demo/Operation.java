package wzh.FactoryMethod.demo;

public abstract class Operation {
    double Number1, Number2;

    public abstract double GetResult();

    public double getNumber1() {
        return Number1;
    }

    public void setNumber1(double number1) {
        Number1 = number1;
    }

    public double getNumber2() {
        return Number2;
    }

    public void setNumber2(double number2) {
        Number2 = number2;
    }
}
