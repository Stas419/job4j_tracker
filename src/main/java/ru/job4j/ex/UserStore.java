package ru.job4j.ex;

import static ru.job4j.ex.FindEl.indexOf;
import static ru.job4j.ex.FindEl.sent;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                return users[i];
            } else {
                new UserNotFoundException();
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            new UserInvalidException();
        } else {
            return true;
        }
        return false;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
