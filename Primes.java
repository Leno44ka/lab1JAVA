public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
    //Метод проходит цикл с 2 до числа и проверяет делится ли входное число на все предыдущие ему
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

