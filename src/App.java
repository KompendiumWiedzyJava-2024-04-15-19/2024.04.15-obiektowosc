import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client[] clients = new Client[100];

        Client c1 = new Client();
        int x = 5;
        Client c2 = new Client();
        c2.name = "Janusz";
        c2.surname = "Kowalski";
        c2.age = 50;
        c2.sex = true;

        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 50;
        c1.sex = true;

        Random r = new Random();
        int[] tab = new int[10];

        System.out.println(c1);
        System.out.println(r);
        System.out.println(tab);

        int y = 5;
        System.out.println(y);

        System.out.println(c1.equals(c2));

        Client c3 = new Client();
        Client c4 = c3;

        c3.name = "Janusz";
        System.out.println(c3.name);
        System.out.println(c4.name);

        c3.name = "Zbyszek";
        System.out.println(c3.name);
        System.out.println(c4.name);

        int[] tab2 = new int[10];
        System.out.println(tab2[0]);
        System.out.println(tab2[1]);
        System.out.println(tab2[2]);
        System.out.println(tab2[3]);
        System.out.println(tab2[4]);
        System.out.println(tab2[5]);

        Client[] tab3 = new Client[10];
        System.out.println(tab3[0]);
        System.out.println(tab3[1]);
        System.out.println(tab3[2]);

        int wynik = c4.add(5, 10);
        System.out.println(wynik);
        System.out.println(c4.multiply(5,5));
        /*int a = c4.wyswietl();
        System.out.println(c4.wyswietl());*/

        Random random = new Random();
        random.nextInt(1,1001);
        c4.add2(4.4, 5.5);
        System.out.println("ABC");
        System.out.println(5);
        System.out.println(random);

        Client c5 = new Client("Jan", "Malinowski", 40, true);
        System.out.println(c5.age);
        System.out.println(c5.name);
        System.out.println(c5.surname);
        System.out.println(c5.sex);
    }
}
