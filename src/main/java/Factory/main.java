package Factory;

public class main {
    public static void main(String[] args) {
        DevelopmentManager devManager = new DevelopmentManager();
        devManager.takeInterview();

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterview();
    }
}
