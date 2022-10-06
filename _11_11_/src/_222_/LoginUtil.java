package _222_;

public class LoginUtil {
    public static void process(String Login) throws WrongLoginException {
        if (Login == null) {
            throw new NullPointerException();
        }
        if (Login.length() >= 20 ) {
            String message = "Длина логина должна быть меньше 20";
            throw new WrongLoginException(message);
        }
        if (Login.contains(" ") ) {
            String message = "Логин не может содержать пробелы";
            throw new WrongLoginException(message);
        }

    }
}

