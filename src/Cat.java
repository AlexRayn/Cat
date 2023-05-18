
public class Cat
{
    static double originWeight;
    static double weight;

    static double minWeight;
    static double maxWeight;
    static double returnMassFood;
    static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = count + 1;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.print("Meow ");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }
    public void getWeightFood()
    {
        returnMassFood = weight - originWeight;
        System.out.println("масса седенной еды -  " + returnMassFood );
    }
    public void toilet()
    {
     weight = weight - 100;
     System.out.println("животное сходило в туалет");
    }
    static int getCount()
    {
        return count;
    }
    public String getStatus()
    {
        if(weight < minWeight) {
            count = count - 1;
            return "Dead";

        }
        else if(weight > maxWeight) {
            count = count - 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";

        }
    }
}