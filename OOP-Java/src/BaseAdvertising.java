public class BaseAdvertising {
    protected int id;
    protected int clicks = 0;
    protected int views = 0;

    public BaseAdvertising() {
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

    public String describeMe() {
        return "BaseAdvertising class: superClass for Ad class and Advertiser class";
    }
}
