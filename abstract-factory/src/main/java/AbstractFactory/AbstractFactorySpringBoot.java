package AbstractFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.example", "AbstractFactory"})
public class AbstractFactorySpringBoot implements CommandLineRunner {

    @Autowired
    private ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactorySpringBoot.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (appContext.containsBean("concreteFactoryA") && appContext.containsBean("concreteFactoryB")) {
            AbstractFactory factoryA = (AbstractFactory) appContext.getBean("concreteFactoryA");
            AbstractFactory factoryB = (AbstractFactory) appContext.getBean("concreteFactoryB");
            AbstractFactory factoryC = (AbstractFactory) appContext.getBean("concreteFactoryC");

            AbstractProduct productA = factoryA.createProduct();
            AbstractProduct productB = factoryB.createProduct();
            AbstractProduct productC = factoryC.createProduct();

            productA.create();
            productB.create();
            productC.create();
        } else {
            System.out.println("Los beans 'concreteFactoryA' y/o 'concreteFactoryB' no están presentes en el contexto de Spring.");
        }
    }
}




