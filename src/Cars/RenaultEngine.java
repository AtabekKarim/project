package Cars;

public class RenaultEngine extends Engine{
    double extraTurboEnergy;


    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    double efficiency() {
        return 0.27;
    }

    @Override
    double throttleEnergy() {
        return getEngineVolume()*getCylinderAmount()*110+extraTurboEnergy;
    }

    @Override
    double breakEnergy() {
        return getEngineWeight()*2.1;
    }

    @Override
    double getMaxSpeed() {
        return super.getMaxSpeed();
    }
}
