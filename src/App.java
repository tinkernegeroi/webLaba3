import java.util.Scanner;

public class App {
    private static Scanner _in;

    private RiversList rivers;

    public App(){
        _in = new Scanner(System.in);
        rivers = new RiversList();
    }

    public void printInfo(){
        System.out.println("Лабораторная работа №3");
        System.out.println("Выполнили студенты группы 24ВП1 Песков Роман и Фомин Владислав");
        System.out.println("Задание: – определить самую короткую реку;" +
                "\n– вывести информацию о реках с длиной больше средней;\n" +
                "– упорядочить список рек по названиям в алфавитном порядке;\n" +
                "– организовать поиск по названию реки, исправление одного из полей и вывод полной информации о реке после редактирования.");
    }

    public void run(){
        River river1 = new PlainRiver("Волга", 3530, "Россия", "Валдайская возвышенность", "Каспийское море",
                8060, 20, true, 1.5, 25, 3);
        River river2 = new MountainRiver("Катунь", 688, "Алтай", "Южно-Чуйский хребет", "Обь",
                700, 5, false, 15, 1200, 4.5);
        River river3 = new PlainRiver("Днепр", 2200, "Украина/Беларусь/Россия", "Валдайская возвышенность", "Черное море",
                1670, 10, true, 1.2, 10, 2);
        rivers.addRiver(river1);
        rivers.addRiver(river2);
        rivers.addRiver(river3);
        rivers.printSortedRivers();
    }


}
