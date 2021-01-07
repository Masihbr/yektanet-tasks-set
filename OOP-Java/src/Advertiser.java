import java.lang.reflect.Field;
import java.util.Arrays;

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

    public void setName(String name) {
        this.name = name;
    }

    public static String help() {
        Field[] AdvertiserFields = Advertiser.class.getDeclaredFields();
        Field[] BaseAdvertisingFields = Advertiser.class.getSuperclass().getDeclaredFields();
        Field[] allFields = new Field[AdvertiserFields.length + BaseAdvertisingFields.length];
        Arrays.setAll(allFields,
                i -> (i < BaseAdvertisingFields.length ?
                        BaseAdvertisingFields[i] :
                        AdvertiserFields[i - BaseAdvertisingFields.length]));
        StringBuilder fieldNames = new StringBuilder("");
        for (Field field : allFields) {
            fieldNames.append(field.getType() + " " + field.getName() + "\n");
        }
        return fieldNames.toString();
    }

    public static int getTotalClicks() {
        return totalClicks;
    }
}
