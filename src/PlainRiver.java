/**
 * Класс, описывающий равнинную реку.
 */
class PlainRiver extends River {

    /**
     * Конструктор класса PlainRiver.
     */
    public PlainRiver(String name, int length, String location, String source, String mouth,
                      double flowRate, double depth, boolean navigable){
        super(name, length, location, source, mouth, flowRate, depth, navigable);
    }

    /**
     * Выводит информацию о равнинной реке.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(name + " течёт по равнинной местности, течение спокойное.");
    }
}
