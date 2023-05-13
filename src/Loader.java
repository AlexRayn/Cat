
public class Loader
{
    public static void main(String[] args)
    {
        Cat boby = new Cat();
        boby.feed(10000.0);
        System.out.println("Боби " + boby.getStatus());
        System.out.println(boby.getStatus());
        Cat murka = new Cat();
        System.out.println(murka.getWeight());
        murka.meow();
        System.out.println(murka.getWeight());
        while(murka.weight >= murka.minWeight)
        {murka.meow();}
        System.out.println("Мурка " + murka.getStatus());
    }
}