package wzh.ObserverMode.demo;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.Attach(new ConcreteObserver1(subject, "观察者1"));
        subject.Attach(new ConcreteObserver2(subject, "观察者2"));
        subject.Attach(new ConcreteObserver1(subject, "观察者3"));

        subject.setSubjectState("出现状况1");
        subject.Notify();
    }
}
