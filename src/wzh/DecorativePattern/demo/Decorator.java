package wzh.DecorativePattern.demo;

public class Decorator extends Component {
    protected Component component;

    // 设置operation
    public void SetComponent(Component component) {
        this.component = component;
    }

    // 重写Operation()，实际执行的是Component的Operation()
    @Override
    public void Operation() {
        if(component != null) {
            component.Operation();
        }
    }
}
