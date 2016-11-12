package randomwebsites;

import java.util.Random;

public class ContactWebsite extends Website {

    public ContactWebsite() {
        title = "Kontakt";
        titleWebsite();
        bodyContact();
        System.out.println(sb);
        writeToFile();
    }

    private void bodyContact() {
        int index = sb.indexOf("<body>");
        sb.insert(index + 6, randomContact());
    }

    private StringBuilder randomContact() {
        Random r = new Random();
        StringBuilder contactBuffer = new StringBuilder("");
        String cities[] = {"Warsszawa", "Wrocław", "Kraków", "Katowice", "Gdańsk", "Opole"};
        String firstName[] = {"Zdzisław", "Tomasz", "Paweł", "Jan", "Józef"};
        String lastName[] ={"Nowak", "Kowalski", "Kwiatkowski", "Malinowski"};
        String street[] = {"Polna", "Leśna", "Lipowa", "Rybna", "Rysia"};

        contactBuffer.append("Telefon " +(r.nextInt(888888888)+111111111) + "<br>Imię i Nazwisko "+firstName[r.nextInt(firstName.length)] + " "+ lastName[r.nextInt(lastName.length)] + "<br>Miasto " +cities[r.nextInt(cities.length)]);
        contactBuffer.append("<br>Ulica " + street[r.nextInt(street.length)] + " nr " + (r.nextInt(110)+1));
        return contactBuffer;
    }
}
