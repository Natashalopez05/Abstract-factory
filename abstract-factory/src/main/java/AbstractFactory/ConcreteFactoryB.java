package AbstractFactory;

import org.springframework.stereotype.Component;

//TableFactory
@Component
public class ConcreteFactoryB  implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProductB();
    }
}
