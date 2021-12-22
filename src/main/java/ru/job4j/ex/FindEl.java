package ru.job4j.ex;

import static ru.job4j.ex.UserStore.findUser;
import static ru.job4j.ex.UserStore.validate;

public class FindEl {
    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String variable : values) {
            if (variable.equals(key)) {
                rsl = 0;
                break;
            }
        }
        if (rsl == -1) {
            new ElementNotFoundException("Url could not be null");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException, ElementNotFoundException {
        if (indexOf(abuses, value) != -1) {
            System.out.println("сообщение отправлено");
        } else {
            new ElementAbuseException("Злоупотребления элементами");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("Пользователь не валидный.");
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            System.out.println("Пользователя не найдено.");
            e.printStackTrace();
        }
    }

