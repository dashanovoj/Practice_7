public class ForString {

    public interface forString {
        static int countSymbols(String s) {
            return s.length(); // метод length() - возвращает длину строки
        }
        static String oddPositions(String s) {
            StringBuilder sb = new StringBuilder(s.length() / 2); // создаём экземпляр строкового объекта для работы над строкой
            for (int i = 1; i < s.length(); i += 2) { // проходимся по последовательности, с шагом 2
                sb.append(s.charAt(i)); // append - метод класса StringBuilder
            }
            return sb.toString(); // возвращаем строковый объект в строку
        }
        static String invert(String s) {
            /* создаём экземпляр строкового объекта, применяем метод класса и переворачиваем последовательность,
            возвращаем в строковый тип */
            return new StringBuilder(s).reverse().toString();
        }
    }

}
