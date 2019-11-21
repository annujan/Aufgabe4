public class Main {
    public static void main(String[] args) {
        Vehicle alfa = new Vehicle();
        Vehicles garage= new Vehicles();
        garage.add (alfa);
        Vehicle audi = new Vehicle();
        garage.add (audi);
    }
}
