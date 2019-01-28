import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {

            System.out.println("Podaj liczby");


            number = scanner.nextInt();
            if (number < 100)

                System.out.println("Liczba za mała");
            else if (number > 200)

                System.out.println("Liczba za duża");

            else if (number % 3 != 0)
                System.out.println("Nie jest podzielna przez 3");

            else if (number % 3 == 0)
                System.out.println("Liczba jest ok");
        }

        while (number < 100 || number > 200 || number % 3 != 0);


    }
}
