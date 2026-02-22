package java


public class Opps17 {
    // composition in java
    public static void main(String[] args) {
        adress ad = new adress("Delhi", "Delhi", "India");
        person p = new person("Jenny", 20, ad);
        p.showPerson();
    }

}

class adress {
    String city;
    String state;
    String country;

    adress(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    void showAdress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
    }

}

class person {

    String name;
    int age;
    adress ad;

    person(String name, int age, adress ad) {
        this.name = name;
        this.age = age;
        this.ad = ad;
    }

    void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        ad.showAdress();
    }
}
