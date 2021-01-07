import java.lang.reflect.Field;

public class Advertiser extends BaseAdvertising {
    private static int totalClicks;
    private String name;

    public Advertiser(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String help() {
        Field[] fields = Advertiser.class.getFields();
        StringBuilder fieldNames = new StringBuilder("");
        for (Field field : fields) {
            fieldNames.append(field.getType() + " " + field.getName() + "\n");
        }
        return fieldNames.toString();
    }

    public static int getTotalClicks() {
        return totalClicks;
    }
}
