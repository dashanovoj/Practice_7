import java.util.Scanner;

public class MathCalc_Tester {

    public static void main(String[] args) {
        MathCalc.MathFunc mathFunc = new MathCalc.MathFunc(); // экземпляр класса
        // Создаем объект класса Scanner, связываем со стандартным потоком ввода (клавиатура - System.in)
        Scanner sc = new Scanner(System.in);

        int operation = 0;
        while (operation != 5) { // продолжение работы, пока не выбрана опция выхода
            System.out.println("Введите номер необходимой операции:\n 1. Возведение в степень\n 2. Модуль комплексного числа\n 3. Число Пи\n 4. Длина окружности\n 5. Выход");
            operation = sc.nextInt(); // с потока ввода получаем число операции
            switch (operation) {
                case 1:
                    System.out.println("Введите основание степени: ");
                    double base = sc.nextDouble();
                    System.out.println("Введите показатель степени: ");
                    double exponent = sc.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + mathFunc.pow(base, exponent));
                    break;
                case 2:
                    System.out.println("Введите действительное число: ");
                    double real = sc.nextDouble();
                    System.out.println("Введите мнимое число: ");
                    double imaginary = sc.nextDouble();
                    System.out.println("|" + String.format("%1$.1f", real) + String.format("%1$+.1f", imaginary) + "i| = " + mathFunc.absComplex(real, imaginary));
                    break;
                case 3:
                    System.out.println("Число ПИ: " + mathFunc.getPI());
                    break;
                case 4:
                    System.out.println("Введите радиус окружности: ");
                    double radius = sc.nextDouble();
                    System.out.println("Длина окружности с радиусом " + radius + " = " + mathFunc.calculateCircleLength(radius));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Вы ввели неверное значение");
            }
        }
    }
}
