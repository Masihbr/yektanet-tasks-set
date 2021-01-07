import java.lang.reflect.Field;

public class Advertiser {
    private static int totalClicks;
    private int id;
    private String name;
    private int clicks;
    private int views;

    public String getName() {
        return name;
    }

    public int getClicks() {
        return clicks;
    }

    public int getViews() {
        return views;
    }

    public void incClicks() {
        clicks++;
    }

    public void incViews() {
        views++;
    }

    public static String help() {
        Field[] fields = Advertiser.class.getFields();
        StringBuilder fieldNames = new StringBuilder("");
        for (Field field : fields) {
            fieldNames.append(field.getType() + " " + field.getName() + "\n");
        }
        return fieldNames.toString();
    }

    public String describeMe(){
        return "Advertiser class";
    }

    public static int getTotalClicks() {
        return totalClicks;
    }
}
