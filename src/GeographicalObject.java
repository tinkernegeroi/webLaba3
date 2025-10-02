class GeographicalObject {
    protected String name;
    protected int length;
    protected String location;
    protected String source;
    protected String mouth;

    public GeographicalObject(String name, int length, String location, String source, String mouth) {
        this.name = name;
        this.length = length;
        this.location = location;
        this.source = source;
        this.mouth = mouth;
    }

    public String getName() { return name; }
    public int getLength() { return length; }
    public String getLocation() { return location; }

    public void printInfo() {
        System.out.println("Название: " + name + ", длина: " + length + " км, местоположение: " + location +
                ", исток: " + source + ", устье: " + mouth);
    }
}