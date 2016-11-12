package randomwebsites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class NewsWebsite extends Website {

    String words[] = new String[2734054];

    public NewsWebsite() {
        title = "Aktualności";
        titleWebsite();
        fillBoard();
        bodyContact();
        System.out.println(sb);
        writeToFile();
    }

    private void bodyContact() {
        int index = sb.indexOf("<body>");
        sb.insert(index + 6, randomNews());

    }

    private void fillBoard() {
        String line;
        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("slowa.txt"));
            do {
                line = br.readLine();
                words[i] = line;
                i++;
            } while (line != null);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private StringBuilder randomNews() {
        StringBuilder newsBuffer = new StringBuilder("");
        Random r = new Random();
        String[] headline = {"Sport<br>", "<br><br>Technika<br>", "<br><br> Motoryzacja <br>", "<br><br> Zycie Gwiazd <br>"};
        for (int j = 0; j < headline.length; j++) {
            int wordsCount = r.nextInt(100) + 200;
            newsBuffer.append(headline[j]);
            for (int i = 0; i < wordsCount; i++) {
                int wordNumber = r.nextInt(words.length - 1);
                newsBuffer.append(words[wordNumber] + " ");
            }
        }
        return newsBuffer;
    }

}
