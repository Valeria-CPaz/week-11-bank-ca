package com.val;

public class TestDrive {

    public void run() {

        testLogin();
    }

    private void testLogin() {
        Login login = new Login();
        login.validation();
    }
}
