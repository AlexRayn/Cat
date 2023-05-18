
public class Loader
{
    public static void main(String[] args)
    {
        Cat felix = new Cat();
        System.out.println("феликс " + felix.getStatus());
        Cat bob = new Cat();
        System.out.println("Боб " + bob.getStatus());
        bob.feed(9000.);
        bob.getWeightFood();
        System.out.println("bob " + bob.getStatus());
        Cat alex = new Cat();
        alex.feed(100000.0);
        alex.getStatus();
        Cat murka = new Cat();
        System.out.println("вес мурки - " + murka.getWeight());

        murka.meow();
        System.out.println("вес мурки - " + murka.getWeight());
        while(murka.getWeight() >= 1000 )
        {
            murka.meow();
        }
        System.out.println( );
        System.out.println("Мурка " + murka.getStatus());
        Cat tom = new Cat();
        System.out.println("вес тома " + tom.getWeight());
        tom.feed(400.0);
        tom.drink(10.0);
        System.out.println("вес тома " + tom.getWeight());
        tom.toilet();
        System.out.println("вес тома " + tom.getWeight());
        System.out.println("том " + tom.getStatus());
        System.out.println("количество живых кошек - " + Cat.getCount());
    }
}