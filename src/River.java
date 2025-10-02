class River extends GeographicalObject{

    protected double flowRate;    // расход воды
    protected double depth;       // средняя глубина
    protected boolean navigable;  // судоходная

    public River(String name, int length, String location, String source, String mouth,
                 double flowRate, double depth, boolean navigable) {
        super(name, length, location, source, mouth);
        this.flowRate = flowRate;
        this.depth = depth;
        this.navigable = navigable;
    }

    public boolean isNavigable() { return navigable; }

    public void editLength(int newLength) { this.length = newLength; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Расход воды: " + flowRate + " м³/с, глубина: " + depth +
                " м, судоходная: " + (navigable ? "Да" : "Нет"));
    }
}
