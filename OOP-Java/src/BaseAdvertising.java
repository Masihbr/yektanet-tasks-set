public class BaseAdvertising {
    protected int id;
    protected int clicks;
    protected int views;

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

    public String describeMe(){
        return "BaseAdvertising class";
    }
}
