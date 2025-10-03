import java.util.ArrayList;
import java.util.Comparator;

/**
 * Класс для управления списком рек.
 */
public class RiversList {
    private ArrayList<River> rivers;

    /**
     * Конструктор инициализирует пустой список рек.
     */
    public RiversList() {rivers = new ArrayList<>();}

    /**
     * Добавляет реку в список.
     *
     * @param r река
     */
    public void addRiver(River r) {rivers.add(r);}

    /**
     * Находит самую короткую реку.
     *
     * @return самая короткая река
     */
    public River findMinLength(){
        River minRiver = rivers.get(0);
        for (River r : rivers){
            if (r.getLength() < minRiver.getLength()){
                minRiver = r;
            }
        }
        return minRiver;
    }

    /**
     * Вычисляет среднюю длину рек.
     *
     * @return средняя длина
     */
    public int findAverageLength(){
        int length = 0;
        for (River r : rivers){
            length += r.getLength();
        }
        return length / rivers.size();
    }

    /**
     * Выводит реки длиннее средней длины.
     */
    public void printRiversWithMoreLength(){
        int avgLength = findAverageLength();
        for (River r : rivers){
            if (r.getLength() > avgLength){
                r.printInfo();
            }
        }
    }

    /**
     * Сортирует реки по алфавиту и выводит их.
     */
    public void printSortedRivers(){
        rivers.stream().sorted(Comparator.comparing(River::getName)).forEach(River::printInfo);
    }

    /**
     * Возвращает все реки.
     *
     * @return список рек
     */
    public ArrayList<River> getAll() {
        return rivers;
    }

    /**
     * Ищет реку по названию.
     *
     * @param name название реки
     * @return найденная река или null
     */
    public River findByName(String name) {
        for (River r : rivers) {
            if (r.getName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        return null;
    }
}
