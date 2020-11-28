package module2.decompositionUsingmethods;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
 * между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Task4 {
    public static void main(String[] args) {

        double[] array = new double[]{0, 5, 4, 4, 5, 5};
        System.out.println("The longest distance between points = " + maxDistance(array));
    }

    public static double maxDistance(double[] array) {
        double maxDistance = 0;
        for (int i = 0; i < array.length - 2; i += 2) {
            for (int j = i + 2; j < array.length; j += 2) {
                double distance = getDistance(array[i], array[i + 1], array[j], array[j + 1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
}
