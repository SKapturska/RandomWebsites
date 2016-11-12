package randomwebsites;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RandomWebsites {
    
    public static void main(String[] args) {
        //Website web = new Website();
        //PhotoGalleryWebsite pgWeb = new PhotoGalleryWebsite();
        //InformationWebsite iWeb = new InformationWebsite();
        //ContactWebsite contactWeb = new ContactWebsite();
        //NewsWebsite newsWeb = new NewsWebsite();
        menu();
        openWeb();
    }
    
    private static void menu() {
        int picked;
        ObjectManager object = new ObjectManager(new WebsiteFactory());
        WebsiteType type = null;
        
        do {
            System.out.println("Którą strone chcesz otworzyć: \n1: Galeria zdjęć \n2: Strona Informacyjna \n3: Strona Kontaktowa \n4: Aktualności \n5: Wyjście ");
            Scanner sc = new Scanner(System.in);
            picked = sc.nextInt();
        } while (picked != 1 && picked != 2 && picked != 3 && picked != 4 && picked != 5);
        if (picked == 1) {
            type = WebsiteType.PHOTOGALERY;
        } else if (picked == 2) {
            type = WebsiteType.INFORMATION;
        } else if (picked == 3) {
            type = WebsiteType.CONTACT;
        } else if (picked == 4) {
            type = WebsiteType.NEWS;
        } else if (picked == 5) {
            System.exit(0);
        }
        object.doAction(type);
    }
    
    private static void openWeb() {
        try {
            Desktop.getDesktop().browse(new File("strona.html").toURI());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
