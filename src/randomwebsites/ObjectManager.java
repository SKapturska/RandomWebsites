package randomwebsites;

public class ObjectManager {
    private WebsiteFactory websiteFactory;

    public ObjectManager(WebsiteFactory websiteFactory) {
        this.websiteFactory = websiteFactory;
    }
    
    public void doAction(WebsiteType type){
        Website website = websiteFactory.createWebsite(type);
    }
}
