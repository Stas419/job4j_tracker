package ru.job4j.ex;

import static ru.job4j.ex.FindEl.indexOf;
import static ru.job4j.ex.FindEl.sent;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                return users[i];
            } else {
                new UserNotFoundException("пользователя не найдено.");
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            new UserInvalidException(" пользователь не валидный.");
        } else {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }

}
