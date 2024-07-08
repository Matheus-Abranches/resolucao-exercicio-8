import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor 1:");
        int valor1 = scanner.nextInt();
        System.out.println("digite o valor 2:");
        int valor2 = scanner.nextInt();
        System.out.println("digite o valor 3:");
        int valor3 = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(valor1);
        numbers.add(valor2);
        numbers.add(valor3);

        Collections.sort(numbers, Comparator.reverseOrder());

        for (int numb : numbers){
            System.out.println(numbers);
        }

    }
}