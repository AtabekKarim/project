package Cars;

public class Main {
    public static void main(String[] args) {
        FerrariEngine ferrariEngine = new FerrariEngine(3.7, 2, 8.5);
        RenaultEngine renaultEngine = new RenaultEngine(1.5, 7, 3.6, 6);

        System.out.println(ferrariEngine.breakEnergy());
        System.out.println(renaultEngine.breakEnergy());
    }
}
