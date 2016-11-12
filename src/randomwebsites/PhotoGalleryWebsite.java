package randomwebsites;

import java.util.Arrays;
import java.util.Random;

public class PhotoGalleryWebsite extends Website {


    public PhotoGalleryWebsite() {
        title = "Galeria zdjęć";
        titleWebsite();
        bodyPhotoGalery();
        System.out.println(sb);
        writeToFile();
    }


    private void bodyPhotoGalery() {
        int index = sb.indexOf("<body>");
        sb.insert(index + 6, randomPhoto());
    }

    private StringBuilder randomPhoto() {
        StringBuilder photosBuffer = new StringBuilder("");
        boolean photos[] = new boolean[10];
        Arrays.fill(photos, true);
        Random r = new Random();
        int index;

        for (int i = 0; i < 4; i++) {
            do {
                index = r.nextInt(photos.length);
            } while (photos[index] == false);
            photos[index] = false;
            photosBuffer.append("\n<img src= \"kot" + index + ".jpg\" width=\"700px\" height=\"400px \"border = \"10\"> ");
            //photosBuffer.append("\n <img src= \"D:\\Studia\\5 sem\\njpo\\RandomWebsites\\kot" + index + ".jpg\" width=\"700px\" height=\"400px\">");
            //images.append("<img src= \"" + files[rng] + "\" width=\"650px\" height=\"450px\">");
        }
        return photosBuffer;
    }

}
