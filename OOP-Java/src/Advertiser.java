import java.lang.reflect.Field;

public class Advertiser extends BaseAdvertising {
    private static int totalClicks;
    private String name;
    private int clicks;
    private int views;

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
