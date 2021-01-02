package wzh.SingletonMode.demo;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.GetInsatance();
        Singleton s2 = Singleton.GetInsatance();

        if(s1 == s2) {
            System.out.println("两个对象是相同的实例");
        }
    }
}
