public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.78;
        int weightInKilo = 75;
        int bmi = (int) service.calculate(heightInMeters, weightInKilo);
        System.out.println("Рост: " + heightInMeters);
        System.out.println("Вес: " + weightInKilo);
        System.out.println("Индекс массы тела: " + bmi);
    }
}