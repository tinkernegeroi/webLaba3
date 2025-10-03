/**
 * Класс, описывающий равнинную реку.
 */
class PlainRiver extends River {
    private double meandering;        // коэффициент извилистости
    private double floodplainWidth;   // ширина поймы
    private double averageFlowSpeed;  // скорость течения

    /**
     * Конструктор класса PlainRiver.
     */
    public PlainRiver(String name, int length, String location, String source, String mouth,
                      double flowRate, double depth, boolean navigable,
                      double meandering, double floodplainWidth, double averageFlowSpeed) {
        super(name, length, location, source, mouth, flowRate, depth, navigable);
        this.meandering = meandering;
        this.floodplainWidth = floodplainWidth;
        this.averageFlowSpeed = averageFlowSpeed;
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
