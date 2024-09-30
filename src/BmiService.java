public class BmiService {
    double calculate(double heightInMeters, int weightInKilo) {
        int index;
        index = (int) (weightInKilo / (heightInMeters * heightInMeters));
        return index;
    }
}
