import java.util.Scanner;

/**
 * Класс для валидации пользовательского ввода.
 */
public class Validator {

    /**
     * Запрашивает у пользователя строку с валидацией.
     *
     * @param sc      сканер
     * @param message сообщение для пользователя
     * @return строка
     */
    public static String getString(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (!input.isEmpty() && !isNumeric(input)) {
                return input;
            }
            System.out.println("Неправильный формат ввода. Введите строку.");
        }
    }

    /**
     * Запрашивает у пользователя целое число.
     *
     * @param sc      сканер
     * @param message сообщение для пользователя
     * @return целое число
     */
    public static int getInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода. Введите целое число.");
            }
        }
    }

    /**
     * Запрашивает у пользователя вещественное число.
     *
     * @param sc      сканер
     * @param message сообщение для пользователя
     * @return вещественное число
     */
    public static double getDouble(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода. Введите число с точкой.");
            }
        }
    }

    /**
     * Запрашивает у пользователя булево значение (true/false).
     *
     * @param sc      сканер
     * @param message сообщение для пользователя
     * @return булево значение
     */
    public static boolean getBoolean(Scanner sc, String message) {
        while (true) {
            System.out.print(message + " (true/false): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                return Boolean.parseBoolean(input);
            }
            System.out.println("Неправильный формат ввода. Введите true или false.");
        }
    }

    /**
     * Проверяет, является ли строка числом.
     *
     * @param str строка
     * @return true, если строка - число
     */
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
