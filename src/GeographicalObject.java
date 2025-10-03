/**
 * Базовый класс для географических объектов (рек).
 */
class GeographicalObject {
    protected String name;
    protected int length;
    protected String location;
    protected String source;
    protected String mouth;

    /**
     * Конструктор класса.
     *
     * @param name      Название объекта
     * @param length    Длина (км)
     * @param location  Местоположение
     * @param source    Исток
     * @param mouth     Устье
     */
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

    /**
     * Печатает информацию об объекте.
     */
    public void printInfo() {
        System.out.println("Название: " + name + ", длина: " + length + " км, местоположение: " + location +
                ", исток: " + source + ", устье: " + mouth);
    }

    public void setName(String name) { this.name = name; }

    /**
     * Устанавливает длину объекта.
     *
     * @param length новая длина (должна быть положительной)
     */
    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Длина должна быть положительной!");
        }
    }

    public void setLocation(String location) { this.location = location; }
    public void setSource(String source) { this.source = source; }
    public void setMouth(String mouth) { this.mouth = mouth; }
}
