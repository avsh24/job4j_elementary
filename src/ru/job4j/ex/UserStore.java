package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int index = 0; index < users.length; index++) {
            if (users.equals(login)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException();
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = true;
        if (user.getUsername().equals(user)) {
            rsl = false;
        }
        if (rsl == user.isValid()) {
            throw new UserInvalidException();
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
