public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            isPalindrom(s);
        }
    }

    //����� ���������� ������ ��������
    public static String reverseString(String s) {
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            n += s.charAt(s.length() - i - 1);
        }
        return n;
    }

    //����� ��������� ����� �� ������� ����� �� �������� � ������� ���������
    public static boolean isPalindrom(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println(s + " - ���������");
            return true;
        } else {
            System.out.println(s + " - �� ���������");
            return false;
        }
    }
}

