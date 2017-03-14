package hello;


public class Login {
    private String userName = "user";
    private String password = "password";
    private String enteredUserName;
    private String enteredPassword;

    public Login() {

    }

    public void setEnteredUserName(String enteredUserName) {
        this.enteredUserName = enteredUserName;
    }

    public void setEnteredPassword(String enteredPassword) {
        this.enteredPassword = enteredPassword;
    }

    public int getPermission(){
        if(enteredUserName==enteredUserName && enteredPassword==enteredPassword){
            return 1;
        }
        return 0;
    }
}
