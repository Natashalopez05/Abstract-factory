package AbstractFactory;

import org.springframework.stereotype.Component;
//SofaFactory
@Component
public class ConcreteFactoryC implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProductC();
    }
}
