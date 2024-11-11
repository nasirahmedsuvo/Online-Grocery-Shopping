public class User{
    @SuppressWarnings("unused")
    private final int userID;
    @SuppressWarnings("unused")
    private final String UserName;
    private final String email;
    private final String password;

    public User(int userID, String UserName, String email, String password){
        this.userID = userID;
        this.UserName = UserName;
        this.email = email;
        this.password = password;
    }

    public void Resister(){
        System.out.println("User's Resistration Complete");
    }

    public boolean Login(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }

    public void Logout(){
        System.out.println("User Logged Out");
    }
}