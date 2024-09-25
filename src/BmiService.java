public class BmiService {
    double calculate(double heightInMeters, int weightInKilo) {
        double index;
        index = (weightInKilo/ (heightInMeters * heightInMeters));
        return index;
    }
}
