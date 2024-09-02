public class Table extends Furniture{
    private int tableLegs;

    public Table(String name, int tableLegs) {
        super(name);
        this.tableLegs = tableLegs;
    }

    @Override
    public String print() {
        return "Name: "+super.getName()+"\nСтол из "+tableLegs+" ножек"+"\n";
    }
}
