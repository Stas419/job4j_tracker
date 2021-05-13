package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;
    public Error(){

    }
    public Error(boolean active, int status, String message){
        this.active = active;
        this.status = status;
        this.message = message;

    }

    public void vivod() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 16, "добро пожаловать;");
        Error error2 = new Error(false, 10, "извините;");
        Error error3 = new Error();

        error.vivod();
        System.out.println();
        error2.vivod();
    }

}
