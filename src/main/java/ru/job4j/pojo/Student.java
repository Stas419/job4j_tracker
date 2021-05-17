package ru.job4j.pojo;

public class Student {
    private String surname;
    private String name;
    private String patronymic;
    private int group;
    private double dateRceipts;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setDateRceipts(double dateRceipts) {
        this.dateRceipts = dateRceipts;
    }
}
