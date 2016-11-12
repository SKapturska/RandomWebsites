package randomwebsites;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class InformationWebsite extends Website {

    String words[] = new String[2734054];

    InformationWebsite() {
        fillBoard();
        title = "Strona informacyjna";
        titleWebsite();
        bodyInformation();
        System.out.println(sb);
        writeToFile();
    }

    private void bodyInformation() {
        int index = sb.indexOf("<body>");
        sb.insert(index + 6, randomWords());
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

    private StringBuilder randomWords() {
        Random r = new Random();
        int wordsCount = r.nextInt(10000)+200;
        StringBuilder wordsBuffer = new StringBuilder("");
        for (int i = 0; i < wordsCount; i++) {
            int wordNumber = r.nextInt(words.length - 1);
            wordsBuffer.append(words[wordNumber] + " ");
        }
        return wordsBuffer;
    }

}
