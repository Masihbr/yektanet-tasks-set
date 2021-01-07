public class Ad {
    private int id;
    private String title;
    private String imgUrl;
    private String link;
    private int clicks;
    private int views;
    private Advertiser advertiser;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    public int getClicks() {
        return clicks;
    }

    public int getViews() {
        return views;
    }

    public void incClicks() {
        clicks++;
        advertiser.incClicks();
    }

    public void incViews() {
        views++;
        advertiser.incViews();
    }

    public String describeMe(){
        return "Ad class";
    }

}
