package randomwebsites;

public class WebsiteFactory {

    public Website createWebsite(WebsiteType type) {

        if (WebsiteType.PHOTOGALERY.equals(type)) {
            return new PhotoGalleryWebsite();
        } else if (WebsiteType.INFORMATION.equals(type)) {
            return new InformationWebsite();
        } else if (WebsiteType.CONTACT.equals(type)) {
            return new ContactWebsite();
        } else if (WebsiteType.NEWS.equals(type)) {
            return new NewsWebsite();
        }
        return null;
    }

}
