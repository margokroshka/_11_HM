package _222_;

public class PasswordUtil {
    public static void  process(String Password, String confirmPassword) throws WrongPasswordException {
        if(Password==null){
            throw new NullPointerException();
        }
        if(!Password.equals(confirmPassword)){
            String  message ="Вы неверно повторили пароль";
            throw new WrongPasswordException(message);
        }
        if(Password.length()>=20){
            String  message ="Длина пароля должна быть меньше 20";
            throw new WrongPasswordException(message);
        }
        if(!Password.matches("[0-9]{1,}")){
            String  message ="Пароль должен содержать хотя бы одну цифру";
            throw new WrongPasswordException(message);
        }
    }
}
