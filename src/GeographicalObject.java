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

    /**
     * Возвращает название географического объекта.
     *
     * @return название
     */
    public String getName() { return name; }

    /**
     * Возвращает длину объекта.
     *
     * @return длина в километрах
     */
    public int getLength() { return length; }

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

    /**
     * Устанавливает новое местоположение объекта.
     *
     * @param location местоположение
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Устанавливает новый исток объекта.
     *
     * @param source исток
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Устанавливает новое устье объекта.
     *
     * @param mouth устье
     */
    public void setMouth(String mouth) {
        this.mouth = mouth;
    }
}
