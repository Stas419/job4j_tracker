package ru.job4j.ex;

import static ru.job4j.ex.FindEl.indexOf;
import static ru.job4j.ex.FindEl.sent;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int num = 0;
        for (User user : users) {
            if (users.equals(login)) {
                return user;
            }
        }

         throw  new UserNotFoundException("пользователя не найдено.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
          throw new UserInvalidException(" пользователь не валидный.");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {new User("Petr Arsentev", true)
        };

        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException unfe) {
            unfe.printStackTrace();
        }
    }
}
