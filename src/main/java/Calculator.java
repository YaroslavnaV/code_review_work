public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        return a / b;
    }

    public int times(int a, int b){
        return a * b;
    }

    public int solver(){
        public static double[] solver(double a, double b, double c) {
            // Проверка на вырожденный случай
            if (a == 0) {
                // Уравнение становится квадратным: bx² + c = 0
                if (b == 0) {
                    return new double[0]; // Нет решений
                }
                // bx² + c = 0 => x² = -c/b
                double xSquared = -c / b;
                if (xSquared < 0) {
                    return new double[0];
                } else if (xSquared == 0) {
                    return new double[]{0.0};
                } else {
                    double x = Math.sqrt(xSquared);
                    return new double[]{-x, x};
                }
            }

            // Решение квадратного уравнения ay² + by + c = 0 относительно y
            double discriminant = b * b - 4 * a * c;

            if (discriminant < 0) {
                return new double[0]; // Нет действительных корней
            }

            double sqrtD = Math.sqrt(discriminant);
            double y1 = (-b + sqrtD) / (2 * a);
            double y2 = (-b - sqrtD) / (2 * a);

            // Используем Set для избежания дубликатов
            java.util.Set<Double> roots = new java.util.HashSet<>();

            // Обратная замена: x² = y => x = ±√y
            if (y1 >= 0) {
                double x1 = Math.sqrt(y1);
                double x2 = -x1;
                roots.add(x1);
                roots.add(x2);
            }

            if (y2 >= 0) {
                double x3 = Math.sqrt(y2);
                double x4 = -x3;
                roots.add(x3);
                roots.add(x4);
            }

            // Преобразование Set в массив
            double[] result = new double[roots.size()];
            int i = 0;
            for (double root : roots) {
                result[i++] = root;
            }

            // Сортировка корней для удобства
            java.util.Arrays.sort(result);

            return result;
        }
    }
    }
}
