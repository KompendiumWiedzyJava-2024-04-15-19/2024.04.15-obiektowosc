public class Client {
    String name;
    String surname;
    int age;
    boolean sex;

    Client(String name, String surname, int age, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    Client() {

    }



    int add(int a, int b) {
        int wynik = a+b;
        return wynik;
    }

    int multiply(int a, int b) {
        return a*b;
    }

    void wyswietl() {
        System.out.println("cos");
    }

    double add2(double a, double b) {
        return a+b;
    }

    double add2(int a, int b) {
        return a+b;
    }

    void powiedzSwojeImie() {
        System.out.println(this.name);
    }
}