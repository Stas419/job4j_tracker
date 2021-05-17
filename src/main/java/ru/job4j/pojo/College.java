package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();

        student.setSurname("Иванов");
        student.getSurname();

        student.setName("Иван");
        student.getName();

        student.setPatronymic("Иванович");
        student.getPatronymic();

        student.setGroup(5);
        student.getGroup();

        student.setDateRceipts(20.03);
        student.getDateRceipts();

        System.out.println(student.getSurname()+ System.lineSeparator()+ student.getName() +
                System.lineSeparator()+student.getPatronymic()+System.lineSeparator()+
                student.getGroup()+System.lineSeparator()+student.getDateRceipts()
        );

    }
}
