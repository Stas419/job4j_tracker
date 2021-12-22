package ru.job4j.ex;

import static ru.job4j.ex.FindEl.indexOf;
import static ru.job4j.ex.FindEl.sent;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int num = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                  num = i;
            } else {
                new UserNotFoundException("пользователя не найдено.");
            }
        }
        return users[num];
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = true;
        if (user.isValid()) {
            System.out.println("все хорошо");
        } else if (!user.isValid() || user.getUsername().length() < 3) {
            new UserInvalidException(" пользователь не валидный.");
            rsl = false;
        }
        return rsl;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {new User("Petr Arsentev", true)
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
}
