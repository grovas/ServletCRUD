package controller;

public class LoginDAO {

    private static String userName = "root";
    private static String password = "pass";

    public static boolean validate(String name,String pass){
        boolean status=false;

        if (name.equals(userName) && pass.equals(password)) {
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }
}
