public class Main {

    public static void main(String[] args) {
        BaseAdvertising baseAdvertising = new BaseAdvertising();
        Advertiser advertiser1 = new Advertiser(1, "name1");
        Advertiser advertiser2 = new Advertiser(2, "name2");
        Ad ad1 = new Ad(1, "title1", "img-url1", "link1", advertiser1);
        Ad ad2 = new Ad(2, "title2", "img-url2", "link2", advertiser2);
        print(baseAdvertising.describeMe());
        print(ad2.describeMe());
        print(advertiser1.describeMe());
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad2.incViews(); //5 times
        ad1.incClicks();
        ad1.incClicks();
        ad2.incClicks(); //3 times
        print(advertiser2.getName());
        advertiser2.setName("new name");
        print(advertiser2.getName());
        print(ad1.getClicks());
        print(advertiser2.getClicks());
        print(Advertiser.getTotalClicks());
        print(Advertiser.help());
    }

    private static void print(Object o){
        System.out.println(o);
    }
}
