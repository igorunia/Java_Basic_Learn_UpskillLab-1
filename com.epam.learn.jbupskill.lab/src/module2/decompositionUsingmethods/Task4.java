package module2.decompositionUsingmethods;
//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
// между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task4 {
    public static void main(String[] args) {

        double[] array = new double[]{0, 5, 4, 4, 5, 5};
        double distance = 0;
        double maxDistance = 0;
        maxDistance(array, distance, maxDistance);
        outPut(maxDistance);

    }

    private static void maxDistance(double[] array, double distance, double maxDistance) {
        for (int i = 0; i < array.length - 2; i += 2) {
            for (int j = 2; j < array.length; j+=2) {

                getDistance(array[i], array[i + 1], array[j], array[j + 1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    distance = maxDistance;
                }

            }
        }
    }

    private static void outPut(double maxDistance) {
        System.out.println();
    }

    private static double getDistance(double x1, double y1, double x2, double y2) {
        double distance;
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
}
