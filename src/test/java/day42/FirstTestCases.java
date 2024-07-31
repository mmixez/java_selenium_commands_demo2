package day42;


import org.testng.annotations.Test;

/*
1) open app
2) login
3) logout
 */
public class FirstTestCases {

    @Test (priority = 1)
    void openApp() {
        System.out.println("opening app");
    }
    @Test (priority = 2)
    void login() {
        System.out.println("login to app");
    }
    @Test (priority = 3)
    void logout() {
        System.out.println("logout from app");
    }

}
