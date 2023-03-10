import java.util.Comparator;

public class User {
    private String login;
    private String password;

    public User() {
    }


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static void getValue(){

    }

    public static  class Adam implements Comparator<Adam> {

        static User user;

        public void setValue(String string,String str){
            user = new User(string,str);
        }

        public void showToInt(int a,int b,Function function){
            System.out.println(function.sum(a,b));
        };

        public void showInfo(){
            System.out.printf("User password: %s , login: %s",user.password,user.login);
        }

        @Override
        public int compare(Adam o1, Adam o2) {
            return 0;
        }
    }

}
