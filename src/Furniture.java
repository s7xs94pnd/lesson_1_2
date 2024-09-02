public abstract class Furniture implements Printable{
    private String name;

    public String getName() {
        return name;
    }

    public Furniture(String name) {
        this.name = name;
    }
}
