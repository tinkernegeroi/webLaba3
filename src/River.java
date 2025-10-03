/**
 * Класс, описывающий реку.
 */
class River extends GeographicalObject {
    protected double flowRate;    // расход воды
    protected double depth;       // средняя глубина
    protected boolean navigable;  // судоходная

    /**
     * Конструктор класса River.
     *
     * @param name      название
     * @param length    длина (км)
     * @param location  местоположение
     * @param source    исток
     * @param mouth     устье
     * @param flowRate  расход воды (м³/с)
     * @param depth     глубина (м)
     * @param navigable судоходность
     */
    public River(String name, int length, String location, String source, String mouth,
                 double flowRate, double depth, boolean navigable) {
        super(name, length, location, source, mouth);
        this.flowRate = flowRate;
        this.depth = depth;
        this.navigable = navigable;
    }

    /**
     * Устанавливает расход воды.
     *
     * @param flowRate новый расход воды (должен быть положительным)
     */
    public void setFlowRate(double flowRate) {
        if (flowRate > 0) {
            this.flowRate = flowRate;
        } else {
            System.out.println("Расход воды должен быть положительным!");
        }
    }

    /**
     * Устанавливает глубину реки.
     *
     * @param depth новая глубина (должна быть положительной)
     */
    public void setDepth(double depth) {
        if (depth > 0) {
            this.depth = depth;
        } else {
            System.out.println("Глубина должна быть положительной!");
        }
    }

    /**
     * Устанавливает судоходность
     *
     * @param navigable судоходность
     * */
    public void setNavigable(boolean navigable) { this.navigable = navigable; }

    /**
     * Печатает информацию о реке.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Расход воды: " + flowRate + " м³/с, глубина: " + depth +
                " м, судоходная: " + (navigable ? "Да" : "Нет"));
    }
}
