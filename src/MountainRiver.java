/**
 * Класс, описывающий горную реку.
 */
class MountainRiver extends River {

    /**
     * Конструктор класса MountainRiver.
     */
    public MountainRiver(String name, int length, String location, String source, String mouth,
                         double flowRate, double depth, boolean navigable) {
        super(name, length, location, source, mouth, flowRate, depth, navigable);
    }

    /**
     * Выводит информацию о горной реке.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(name + " течёт по горной местности, течение быстрое и порожистое.");
    }
}
