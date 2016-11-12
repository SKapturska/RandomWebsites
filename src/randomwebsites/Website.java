package randomwebsites;

import java.io.IOException;
import java.io.PrintWriter;

public class Website {

    protected WebsiteType websiteType;
    String title = "";

    StringBuilder sb = new StringBuilder("");

    Website() {
        sb.append("<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"utf-8\">\n<title>\n</title>\n</head>\n<body>\n</body>\n</html>");

    }

    void titleWebsite() {
        int index = sb.indexOf("<title>");
        sb.insert(index + 7, title);
    }

    void writeToFile() {
        try {
            PrintWriter pw = new PrintWriter("strona.html");
            pw.write(sb.toString());
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
