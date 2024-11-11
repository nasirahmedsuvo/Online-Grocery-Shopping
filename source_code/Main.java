public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Robert Downey Jr", "rdj@gmail.com", "I'mIronMan");
        user.Resister();

        if(user.Login("rdj@gmail.com", "I'mIronMan")){
            System.out.println("User Logged In");
        }
    }

    
}
