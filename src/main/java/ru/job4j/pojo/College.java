package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();

        student.setSurname("Иванов");

        student.setName("Иван");

        student.setPatronymic("Иванович");

        student.setGroup(5);

        student.setDateRceipts(20.03);

        System.out.println(student.getSurname() + " " + student.getName()
                + " " + student.getPatronymic() + " " + "Группа - " + student.getGroup()
                + " " + "Дата рождения - " + student.getDateRceipts());
    }
}
