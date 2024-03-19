package AbstractFactory;
//Sofa
public class ConcreteProductC  implements AbstractProduct{
    @Override
    public void create() {
        System.out.println("Sofa creado");
    }
}
