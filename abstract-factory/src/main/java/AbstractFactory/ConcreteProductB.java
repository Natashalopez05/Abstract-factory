package AbstractFactory;
//Table
public class ConcreteProductB  implements AbstractProduct{
    @Override
    public void create() {
        System.out.println("Mesa creada");
    }
}
