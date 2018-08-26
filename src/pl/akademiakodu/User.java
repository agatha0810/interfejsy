package pl.akademiakodu;


public class User extends AbstractUser implements Userable {

    public User(String username) {
        setUsername(username);
    }


    // musimy zaimplementować, ponieważ
    // metoda jest abstrakcyjna w klasie AbstractUser
    @Override
    String go() {
        return "idzie użytkownik";
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }
}
