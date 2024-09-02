public class Sofa extends Furniture{
    private String surfaceMaterial;
    public Sofa(String name,String surfaceMaterial) {
        super(name);
        this.surfaceMaterial=surfaceMaterial;
    }
    @Override
    public String print() {
        return "Name: "+super.getName()+"\nМатериял поверхности дивана: "+surfaceMaterial+"\n";
    }
}
