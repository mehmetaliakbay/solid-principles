package akbay.mehmetali.singleresponsibility.exampleone;

public interface User {
    boolean login(String userName, String password);
    boolean register(String userName, String password, String email);
}
