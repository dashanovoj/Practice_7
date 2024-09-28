import java.lang.Math;

public class MathCalc {

    public interface MathCalculable {
        // Создаём абстрактные методы для их реализации в классе
        double pow(double base, double exponent);
        double absComplex(double real, double imaginary);
        double getPI();
    }

    public static class MathFunc implements MathCalculable {
        // Определяем константу Пи
        private static final double PI = 3.14159265359;

        @Override
        public double pow(double base, double exponent) {
            return Math.pow(base, exponent); // метод pow класса Math - возведение в степень
        }

        @Override
        public double absComplex(double real, double imaginary) {
            return Math.sqrt(real * real + imaginary * imaginary); // метод sqrt класса Math - извлечение корня
        }

        @Override
        public double getPI() {
            return PI; // возвращаем значение константы
        }

        public double calculateCircleLength(double radius) {
            return 2 * getPI() * radius; // формула длины окружности 2*PI*R
        }

    }

}
