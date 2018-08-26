package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;

public class Admin extends AbstractUser implements Userable {

    private String email;

    public Admin(String username, String email) {
        setUsername(username);
        this.email = email;
    }

    @Override
    String go() {
        return "Idzie admin";
    }

    public String getUsername() {
        return super.getUsername();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static void main(String[] args) {
        // user jest typu Userable
        // natomiast w pamięci jest trzymany obiekt Usera
        // do czyenia mamy z polimorfizmem
        // polimorfizm jeden obiekt może być traktowany jako różne typy
        Userable user = new User("michalos");

        // w tym momencie zmienna user ma dostęp tylko do metody getUsername
        // nic więcej
        System.out.println(user.getUsername());
        //user.setUsername("anna") nie działa

        User myUser = (User)user;
        myUser.setUsername("anna");
        System.out.println(myUser.getUsername());

        // w users chcemy mieć i Adminów i Użytkowników
        // jak to zrobić? Admin i User nie mają wspólnego typu?

        List<Userable> users = new ArrayList<>();
        // jeśli mamy listę Userable to wszystkie obiekty
        // muszą należeć do klasy, która implementuje interfejs Userable

        // poniżej dodajemy użytkownika na 2 różne sposoby !!
        users.add(myUser); // dodanie użytkownika

        users.add(new Admin("aaa","admin@gmail.com")); // dodanie admina
        // w pamięci jest admin, tylko w danym momencie jest traktowany jako
        // interfejs

        users.add(new User("zosia15")); // dodanie użytkownika
        users.add(new Admin("www","www@wp.pk")); // dodanie admina

        System.out.println("Wypisanie użytkowników");
        // pętla foreach z interfejsem
        for ( Userable u: users){
            System.out.println(u.getUsername());
            // sprawdzenie czy typ interfejsowy nie należy do klasy Admin
            if (u instanceof Admin){
                Admin admin = (Admin) u;
                System.out.println("Dla admina "+admin.getEmail());
            }
        }

        // w users chcemy mieć i Adminów i Użytkowników
        // jak to zrobić? Admin i User nie mają wspólnego typu?

        // rozwiązanie tego samo problemu tylko za pomocą dziedziczenia!

        List<AbstractUser> userList = new ArrayList<>();
        userList.add(myUser); // dodanie użytkownika

        userList.add(new Admin("aaa","admin@gmail.com")); // dodanie admina
        // w pamięci jest admin, tylko w danym momencie jest traktowany jako
        // interfejs

        userList.add(new User("zosia15")); // dodanie użytkownika
        userList.add(new Admin("www","www@wp.pk")); // dodanie admina

        System.out.println("Drugi sposób lista użytkowników");
        for (AbstractUser user1: userList ){
            System.out.println(user1.getUsername());
            // sprawdzenie czy typ interfejsowy nie należy do klasy Admin
            if (user1 instanceof Admin){
                Admin admin = (Admin) user1;
                System.out.println("Dla admina "+admin.getEmail());
            }
        }




    }


}
