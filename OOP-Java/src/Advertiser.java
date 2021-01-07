import java.util.ArrayList;


public class Advertiser extends BaseAdvertising {
    private static ArrayList<Advertiser> advertisers = new ArrayList<>();
    private String name;

    public Advertiser(int id, String name) {
        super();
        this.id = id;
        this.name = name;
        advertisers.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String help() {
        return "Advertiser{" + '\n'
                + "     " + "String name: contains name of the Advertiser" + '\n'
                + "     " + "int id: a unique number to identify Advertiser" + '\n'
                + "     " + "int clicks: contains number of clicks that Advertiser has received" + '\n'
                + "     " + "int views: contains number of clicks that Advertiser has received" + '\n'
                + '}';
    }

    /*  alternative help (if the fields are gonna change over time)
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
    */

    public static int getTotalClicks() {
        int totalClicks = 0;
        for (Advertiser advertiser : advertisers) {
            totalClicks += advertiser.getClicks();
        }
        return totalClicks;
    }

    @Override
    public String describeMe() {
        return "Advertiser class";
    }
}
