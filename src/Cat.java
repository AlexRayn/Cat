
public class Cat
{
    static double originWeight;
    static double weight;

    static double minWeight;
    static double maxWeight;
    static double returnMassFood;
    static int count;
    public static final int AMOUNT_EYES = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = count + 1;
        System.out.println("Создана новая кошка");
    }
    public Cat(double weight){
        this();
        this.weight = weight;
        System.out.println("Создана кошка с весом: " + getWeight());
    }
        public void meow ()
        {
            if (getWeight() >= 1000 && getWeight() <= 9000){weight = weight - 1;
            System.out.print("МЯВК ");}
            else {System.out.println("мёртвое животное не издает звуки");}
        }

        public void feed (Double amount)
        {
            if (getWeight() >= 1000 && getWeight() <= 9000){weight = weight + amount;}
            else {System.out.println("мёртвое животное не может есть");}
        }

        public void drink (Double amount)
        {
            if (getWeight() >= 1000 && getWeight() <= 9000)
            {
                weight = weight + amount;
            }
            else {System.out.println("мёртвое животное не может пить");}
        }

        public Double getWeight ()
        {
            return weight;
        }
        public void getWeightFood ()
        {
            returnMassFood = weight - originWeight;
            System.out.println("масса седенной еды -  " + returnMassFood);
        }
        public void toilet ()
        {
            if (getWeight() >= 1000 && getWeight() <= 9000) {
                weight = weight - 100;
                System.out.println("животное сходило в туалет");
            }
            else {System.out.println("мёртвое животное не может ходить в туалет");}
        }
        static int getCount ()
        {
            return count;
        }
        public String getStatus ()
        {
            if (weight < minWeight) {
                count = count - 1;
                return "умер(ла)";
            }
            else if (weight > maxWeight) {
                count = count - 1;
                return "взорван(а)";
            } else if (weight > originWeight) {
                return "спит";
            }
            else {return "играет";
            }
        }
}