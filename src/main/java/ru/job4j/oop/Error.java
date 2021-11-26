package ru.job4j.oop;

public class Error {
    private  boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void errorInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error2 = new Error(true, 1, "не значительная");
        Error error3 = new Error(false, 0, "ошибка не обнаружена");

        error.errorInfo();
        error2.errorInfo();
        error.errorInfo();
    }
}
