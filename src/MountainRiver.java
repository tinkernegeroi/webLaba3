class MountainRiver extends River {
    private int rapidsCount;      // количество порогов
    private double heightDrop;    // перепад высот
    private double averageSlope;  // средний уклон

    public MountainRiver(String name, int length, String location, String source, String mouth,
                         double flowRate, double depth, boolean navigable,
                         int rapidsCount, double heightDrop, double averageSlope) {
        super(name, length, location, source, mouth, flowRate, depth, navigable);
        this.rapidsCount = rapidsCount;
        this.heightDrop = heightDrop;
        this.averageSlope = averageSlope;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(name + " течёт по горной местности, течение быстрое и порожистое.");
    }
}