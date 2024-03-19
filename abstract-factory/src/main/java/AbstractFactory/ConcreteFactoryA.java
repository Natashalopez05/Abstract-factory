package AbstractFactory;

import org.springframework.stereotype.Component;
//ChairFactory
@Component
public class ConcreteFactoryA implements  AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProductA();
    }
}
