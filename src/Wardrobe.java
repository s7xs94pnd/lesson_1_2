public class Wardrobe extends Furniture{
private int shelf;

    public Wardrobe(String name, int shelf) {
        super(name);
        this.shelf = shelf;
    }

    @Override
    public String print() {
        return "Name: "+super.getName()+"\nШкаф состоит из "+shelf+" полок"+"\n";
    }
}
