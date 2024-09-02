public class Main {
    public static void main(String[] args) {
        Furniture object1 = createObject("Sofa");
        if (object1 != null) {
            System.out.println("Created a " + object1.getName());
        }
        Furniture object2 = createObject("Table");
        if (object2 != null) {
            System.out.println("Created a " + object2.getName());
        }
        Furniture object3 = createObject("Wardrobe");
        if (object1 != null) {
            System.out.println("Created a " + object3.getName());
        }

        Printable[]furniture={object1,object2,object3};
        for (int i = 0; i < furniture.length; i++) {
            System.out.println(furniture[i].print());
        }
    }

    public static Furniture createObject(String className) {
        switch (className) {
            case "Sofa":
                return new Sofa("Диван", "Эко кожа");
            case "Table":
                return new Table("Стол", 4);
            case "Wardrobe":
                return new Wardrobe("Шкаф", 8);
            default:
                return null;
        }
    }
}
