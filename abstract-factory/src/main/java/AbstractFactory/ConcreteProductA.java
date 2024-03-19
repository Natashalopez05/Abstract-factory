package AbstractFactory;
//Chair
public class ConcreteProductA  implements AbstractProduct{
    @Override
    public void create() {
        System.out.println("Silla creada");
    }
}
