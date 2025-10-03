import java.util.Scanner;

/**
 * Главный класс приложения для работы со списком рек.
 */
public class App {
    private static Scanner _in;
    private RiversList rivers;

    /**
     * Конструктор инициализирует список рек и сканер ввода.
     */
    public App(){
        _in = new Scanner(System.in);
        rivers = new RiversList();
    }

    /**
     * Печатает информацию о лабораторной работе и задании.
     */
    public void printLabInfo(){
        System.out.println("Лабораторная работа №3");
        System.out.println("Выполнили студенты группы 24ВП1 Песков Роман и Фомин Владислав");
        System.out.println("Задание: – определить самую короткую реку;" +
                "\n– вывести информацию о реках с длиной больше средней;\n" +
                "– упорядочить список рек по названиям в алфавитном порядке;\n" +
                "– организовать поиск по названию реки, исправление одного из полей и вывод полной информации о реке после редактирования.");
    }

    /**
     * Отображает меню команд программы.
     */
    public void showCommands(){
        System.out.println("Меню программы:");
        System.out.println("1 - Создать реку");
        System.out.println("2 - Вывести все реки");
        System.out.println("3 - Найти самую короткую реку");
        System.out.println("4 - Вывести реки длиннее средней");
        System.out.println("5 - Упорядочить список по алфавиту");
        System.out.println("6 - Поиск по названию и редактирование");
        System.out.println("0 - Выход");
    }

    /**
     * Создаёт новую реку на основе пользовательского ввода.
     */
    private void createRiver() {
        String name = Validator.getString(_in, "Введите название реки: ");
        int length = Validator.getInt(_in, "Введите длину (км): ");
        String location = Validator.getString(_in, "Введите местоположение: ");
        String source = Validator.getString(_in, "Введите исток: ");
        String mouth = Validator.getString(_in, "Введите устье: ");

        double flowRate = Validator.getDouble(_in, "Введите расход воды (м³/с): ");
        double depth = Validator.getDouble(_in, "Введите среднюю глубину (м): ");
        boolean navigable = Validator.getBoolean(_in, "Судоходная");

        River river = new River(name, length, location, source, mouth, flowRate, depth, navigable);
        rivers.addRiver(river);
        System.out.println("Река успешно добавлена!");
    }

    /**
     * Выводит информацию обо всех реках в списке.
     */
    private void printAllRivers() {
        for (River r : rivers.getAll()) {
            r.printInfo();
        }
    }

    /**
     * Осуществляет поиск реки по названию и позволяет редактировать её поля.
     */
    private void editRiver() {
        String name = Validator.getString(_in, "Введите название реки для поиска: ");

        River river = rivers.findByName(name);
        if (river == null) {
            System.out.println("Река с таким названием не найдена.");
            return;
        }

        System.out.println("Найдена река:");
        river.printInfo();

        int choice;
        do {
            System.out.println("\nЧто хотите изменить?");
            System.out.println("1 - Название");
            System.out.println("2 - Длину");
            System.out.println("3 - Местоположение");
            System.out.println("4 - Исток");
            System.out.println("5 - Устье");
            System.out.println("6 - Расход воды");
            System.out.println("7 - Глубину");
            System.out.println("8 - Судоходность");
            System.out.println("0 - Завершить редактирование");

            choice = Validator.getInt(_in, "Ваш выбор: ");

            switch (choice) {
                case 1 -> river.setName(Validator.getString(_in, "Введите новое название: "));
                case 2 -> river.setLength(Validator.getInt(_in, "Введите новую длину (км): "));
                case 3 -> river.setLocation(Validator.getString(_in, "Введите новое местоположение: "));
                case 4 -> river.setSource(Validator.getString(_in, "Введите новый исток: "));
                case 5 -> river.setMouth(Validator.getString(_in, "Введите новое устье: "));
                case 6 -> river.setFlowRate(Validator.getDouble(_in, "Введите новый расход воды (м³/с): "));
                case 7 -> river.setDepth(Validator.getDouble(_in, "Введите новую глубину (м): "));
                case 8 -> river.setNavigable(Validator.getBoolean(_in, "Судоходная"));
                case 0 -> System.out.println("Редактирование завершено.");
                default -> System.out.println("Неверный выбор.");
            }

            if (choice != 0) {
                System.out.println("\nТекущие данные о реке:");
                river.printInfo();
            }

        } while (choice != 0);
    }

    /**
     * Запускает основной цикл программы.
     */
    public void run(){
        rivers.addRiver(new PlainRiver("Волга", 3530, "Россия", "Валдайская возвышенность", "Каспийское море",
                8060, 20, true));
        rivers.addRiver(new MountainRiver("Катунь", 688, "Алтай", "Южно-Чуйский хребет", "Обь",
                700, 5, false));
        rivers.addRiver(new PlainRiver("Днепр", 2200, "Украина/Беларусь/Россия", "Валдайская возвышенность", "Черное море",
                1670, 10, true));

        printLabInfo();

        int choice;
        do {
            showCommands();
            System.out.print("Введите номер команды: ");
            choice = Integer.parseInt(_in.nextLine());

            switch (choice) {
                case 1 -> createRiver();
                case 2 -> printAllRivers();
                case 3 -> System.out.println("Самая короткая река: " + rivers.findMinLength().getName());
                case 4 -> rivers.printRiversWithMoreLength();
                case 5 -> rivers.printSortedRivers();
                case 6 -> editRiver();
                case 0 -> System.out.println("Выход из программы...");
                default -> System.out.println("Неверный ввод, попробуйте снова.");
            }
        } while (choice != 0);
    }
}
