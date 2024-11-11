public class User{
    private int userID;
    private String name;
    private String email;
    private String password;

    public User(int userID, String name, String email, String password){
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void Resister(){
        System.out.println("User's Resistration Complete");
    }

    public boolean Login(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }
}