public class BmiService {
    public int calculate(double heightInMeters, int weightInKilo) {
        double index;
        index = (weightInKilo / (heightInMeters * heightInMeters));
        return (int)index;
    }
}
