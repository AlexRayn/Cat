
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println(murka.getWeight());
        murka.meow(2000.0);
        System.out.println(murka.getWeight());
        System.out.println("Мурка " + murka.getStatus());
        Cat boby = new Cat();
        boby.feed(10000.0);
        System.out.println("Боби " + boby.getStatus());
    }
}