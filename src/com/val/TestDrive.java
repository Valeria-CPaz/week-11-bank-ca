package com.val;

public class TestDrive {

    public void run() {

        testLogin();
        testEmployee();
    }

    private void testEmployee() {
        Employee employee = new Employee();

    }

    private void testLogin() {
        Login login = new Login();
        login.validation();
    }
}
