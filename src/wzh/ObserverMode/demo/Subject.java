package wzh.ObserverMode.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    // 增加观察者
    public void Attach(Observer observer) {
        this.observers.add(observer);
    }
    // 删除观察者
    public void Detach(Observer observer) {
        this.observers.remove(observer);
    }
    // 通知观察者
    public void Notify() {
        for(Observer observer : observers) {
            observer.Update();
        }
    }
}
