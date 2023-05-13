
public class Loader
{
    public static void main(String[] args)
    {
        Cat boby = new Cat();
        System.out.println("Боби " + boby.getStatus());
        boby.feed(9000.);
        boby.getWeightFood();
        System.out.println("boby " + boby.getStatus());
        Cat murka = new Cat();
        System.out.println("вес мурки - " + murka.getWeight());
        murka.meow();
        System.out.println("вес мурки - " + murka.getWeight());
        while(murka.weight >= murka.minWeight)
        {murka.meow();}
        System.out.println("Мурка " + murka.getStatus());
        Cat tom = new Cat();
        System.out.println("вес тома " + tom.getWeight());
        tom.feed(400.0);
        System.out.println("вес тома " + tom.getWeight());
        tom.toilet();
        System.out.println("вес тома " + tom.getWeight());

    }
}