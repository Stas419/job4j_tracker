package ru.job4j.oop;

public class JSONReport extends HtmlReport {

    @Override
    public String generate(String name, String body) {
        return "{ " + System.lineSeparator() + " name : " + name + ","
                + System.lineSeparator() + " body : " + body + System.lineSeparator() + "} ";
    }

    public static void main(String[] args) {
        JSONReport jSONReport = new JSONReport();
        System.out.println(jSONReport.generate("собака", "муха"));

    }
}
