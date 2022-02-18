public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            isPalindrom(s);
        }
    }

    //Метод возвращает строку наоборот
    public static String reverseString(String s) {
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            n += s.charAt(s.length() - i - 1);
        }
        return n;
    }

    //Метод проверяет равна ли входная трока ей обратной и выводит сообщение
    public static boolean isPalindrom(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println(s + " - Палиндром");
            return true;
        } else {
            System.out.println(s + " - Не палиндром");
            return false;
        }
    }
}

